package Hardware;
import java.util.*;
/**
 * Created by jona0 on 08-02-17.
 */
public class CPU {
    private double speed;
    private double usage;
    private int cores;
    private String manifacture;

    public CPU() {
        Properties p = System.getProperties();
        this.speed = 2.4;
        this.usage = 0.0;
        this.cores = Runtime.getRuntime().availableProcessors();
        this.manifacture = p.getProperty("os.arch");
    }
    public void getProb(){
        System.out.println("\tSpeed \t= " + speed + " GHz");
        System.out.println("\tCores \t= " + cores);
        System.out.println("\tChip \t= " + manifacture);

    }
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getUsage() {
        return usage;
    }

    public void setUsage(double usage) {
        this.usage = usage;
    }
}
