package org.cpuschedule.utility;

public class InputData {
    private int pid;
    private int btime;

    private int atime;
    private int priority;

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setBtime(int btime) {
        this.btime = btime;
    }

    public void setAtime(int atime) {
        this.atime = atime;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPid() {
        return pid;
    }

    public int getBtime() {
        return btime;
    }

    public int getAtime() { return atime; }

    public int getPriority() {
        return priority;
    }

    public InputData(int pid, int btime, int atime) {
        this.pid = pid;
        this.btime = btime;
        this.atime = atime;
    }

    public InputData(int pid, int btime, int atime, int p) {
        this.pid = pid;
        this.btime = btime;
        this.priority = p;
        this.atime = atime;
    }

    public InputData() {}

}