package Hardware;
import java.lang.management.ManagementFactory;

/**
 * Created by jona0 on 08-02-17.
 */
public class RAM {
    private long capacity;
    private int used;

    public RAM() {
        this.capacity = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        this.used = 0;
    }
    public void getProb(){
        long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        System.out.println("\tMemory size \t= " + memorySize + " Bytes");
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }
}
