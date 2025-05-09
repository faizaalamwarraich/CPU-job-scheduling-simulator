package org.cpuschedule.utility;

public class Pair {

    private int first; // pid

    private int second; // btime

    private int third; // atime

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    public Pair(int a, int b){
        this.first = a;
        this.second = b;

    }

    public Pair(int a, int b,int c){
        this.first = a;
        this.second = b;
        this.third = c;
    }

}
