package Hardware;
import java.awt.*;

/**
 * Created by jona0 on 08-02-17.
 */
public class Motherboard {
    private boolean harddisk;
    private boolean cpu;
    private boolean ram;
    private boolean bios;
    private boolean monitor;
    private boolean mouse;
    private boolean keyboard;
    private boolean diskdrive;

    public Motherboard() {
        this.harddisk = false;
        this.cpu = false;
        this.ram = false;
        this.bios = false;
        this.monitor = false;
        this.mouse = false;
        this.keyboard = false;
        this.diskdrive = false;
    }
    public void systemTest() throws Exception{
        this.harddisk = true;
        this.cpu = true;
        this.ram = true;
        this.bios = true;
        this.monitor = true;
        this.mouse = true;
        this.keyboard = true;
        this.diskdrive = true;
        if (this.harddisk && this.cpu && this.ram && this.bios && this.monitor && this.mouse && this.keyboard){
            System.out.println("Harddisk = " + harddisk);
            Harddisk hd = new Harddisk();
            hd.getProb();
            Thread.sleep(500);
            System.out.println("CPU = " + cpu);
            CPU cpu = new CPU();
            cpu.getProb();
            Thread.sleep(500);
            System.out.println("RAM = " + ram);
            RAM ram = new RAM();
            ram.getProb();
            Thread.sleep(500);
            System.out.println("BIOS = " + bios);
            Thread.sleep(500);
            System.out.println("Monitor = " + monitor);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();
            System.out.println("\t Screen resolution \t= " + width + "x" + height);
            Thread.sleep(500);
            System.out.println("Mouse = " + mouse);
            System.out.println("\t Number of buttons \t = " + MouseInfo.getNumberOfButtons());
            Thread.sleep(500);
            System.out.println("Keyboard = " + keyboard);
            Thread.sleep(500);
            System.out.println("Diskdrive = " + diskdrive);


        }

    }
}
