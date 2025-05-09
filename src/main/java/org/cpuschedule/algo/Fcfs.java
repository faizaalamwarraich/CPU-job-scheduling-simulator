package org.cpuschedule.algo;

import org.cpuschedule.utility.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Fcfs extends CpuAlgo{
    @Override
    public void get_input(ArrayList<Integer> input) {
        n = input.get(1);
        for (int j=2,i=0; i < n; i++,j+=3) {
            pid = input.get(j);
            btime = input.get(j+1);
            atime = input.get(j+2);
            System.out.println("stimer: "+ atime);
            rq.add(new Pair(pid,btime,atime));
        }
    }

    public int[][] sortedProcesses(){
        int [][] arrSorted = new int[n][3];
        for(int i=0;i<n;i++){
            temp = rq.peek();

            arrSorted[i][0]=rq.peek().getFirst();
            arrSorted[i][1]=rq.peek().getThird();
            arrSorted[i][2]=rq.peek().getSecond();
            rq.poll();
        }

       Arrays.sort(arrSorted, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
               return  Integer.compare(o1[1],o2[1]);
           }
       });
        return arrSorted;
    }

    @Override
    public void calculate() {
        avg_t=avg_w=0;
        int[][] sortedProcesses=sortedProcesses();
        for (int i=0; i <n ; i++) {


            if ( i==0 ) {
                arr[0][0]=sortedProcesses[0][0]; // pid
                arr[0][1]=sortedProcesses[0][1]; //  arrivaltime
                arr[0][2]=sortedProcesses[0][2]; // burst time
                arr[0][4] = sortedProcesses[0][2];  // tat
                arr[0][3]= 0; // wait time
            }
            else {
                arr[i][0] = sortedProcesses[i][0];
                arr[i][1] = sortedProcesses[i][1];
                arr[i][2] = sortedProcesses[i][2];
                int burstTimes = 0;
                for(int j=0;j<=i;j++){
                    burstTimes+=sortedProcesses[j][2];
                }
                arr[i][4] = (burstTimes - sortedProcesses[i][1]);
                arr[i][3] = arr[i][4] - arr[i][2];
            }
//            rq.poll();
            avg_w += arr[i][3];
            avg_t += arr[i][4];

            chart.add(new Pair(temp.getFirst(), arr[i][4]));
        }
        avg_w /= n;
        avg_t /= n;
    }
}
