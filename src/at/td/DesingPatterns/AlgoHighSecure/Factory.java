package at.td.DesingPatterns.AlgoHighSecure;

public class Factory {

    public enum OperatingSystem{WINDOWS, APPLE, LINUX}
    public Algorythmus getBestAlgo(OperatingSystem os){
        if (os==OperatingSystem.APPLE){
            return new SteveJobsAlgo();
        }
        else if (os==OperatingSystem.WINDOWS){
            return new BillGatesAlgo();
        }
        else if (os==OperatingSystem.LINUX){
            return new LinusTorvaldAlgo();
        }
        return null;
    }
}
