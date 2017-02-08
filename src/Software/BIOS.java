package Software;
import Hardware.*;
/**
 * Created by jona0 on 08-02-17.
 */
public class BIOS {
    private boolean completed;
    private static int boot;

    public BIOS() {
        this.completed = false;
        boot = 0;
    }

    public void bootOptions()throws Exception {
        this.boot = 1;
        if (this.boot == 1){
            System.out.println("Running BIOS test");
            Thread.sleep(1000);
            Motherboard mb = new Motherboard();
            mb.systemTest();
            OS os = new OS();
            os.startUp();

        }
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getBoot() {
        return boot;
    }

    public void setBoot(int boot) {
        this.boot = boot;
    }
}
