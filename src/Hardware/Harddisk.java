package Hardware;
import java.lang.*;
import java.io.*;

/**
 * Created by jona0 on 08-02-17.
 */
public class Harddisk {
    private long diskSize;
    private long freeSpace;

    public Harddisk() {
        this.diskSize = new File("/").getTotalSpace();
        this.freeSpace = new File("/").getFreeSpace();
    }

    public void getProb(){
        System.out.println("\tDisk size \t= " + diskSize + " Bytes");
        System.out.println("\tFree space \t= " + freeSpace + " Bytes");

    }
}
