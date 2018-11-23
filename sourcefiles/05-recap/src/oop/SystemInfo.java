package oop;

public class SystemInfo {
    private String hostname;
    private int amountRAM;
    private int diskCapacityMB;
    private CPU cpu;

    public SystemInfo(String hostname, int amountRAM, int diskCapacityMB, CPU cpu) {
        this.amountRAM = amountRAM;
        this.hostname = hostname;
        this.diskCapacityMB = diskCapacityMB;
        this.cpu = cpu;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public int getDiskCapacityMB() {
        return diskCapacityMB;
    }

    public void setDiskCapacityMB(int diskCapacityMB) {
        this.diskCapacityMB = diskCapacityMB;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void printSysInfo() {
        System.out.println("My name is " + hostname + " and I have " + amountRAM +
                "MB RAM and a " + cpu + "CPU.");
    }

    public void appendToHostname(String text) {
        this.hostname += text; // += is the same as = hostname + text
    }

    public void appendToHostname(int i) {
        this.hostname += i;
    }
}
