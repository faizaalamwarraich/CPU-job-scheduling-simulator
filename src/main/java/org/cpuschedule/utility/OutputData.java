package org.cpuschedule.utility;

public class OutputData {
    int pid,btime,atime,wait,turn;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setBtime(int btime) {
        this.btime = btime;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public void setTurn(int ta_time) {
        this.turn = ta_time;
    }

    public int getPid() {
        return pid;
    }

    public int getBtime() {
        return btime;
    }

    public int getWait() {
        return wait;
    }

    public int getTurn() {
        return turn;
    }

    public OutputData(int pid,int atime, int btime, int wait, int turn ){
        this.pid = pid;
        this.atime = atime;
        this.btime = btime;
        this.wait = wait;
        this.turn = turn;
    }

    public int getAtime() {
        return atime;
    }

    public void setAtime(int atime) {
        this.atime = atime;
    }
}