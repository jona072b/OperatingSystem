package Hardware;
import Software.*;
/**
 * Created by jona0 on 08-02-17.
 */
public class PSU {
    private boolean power;

    public PSU() {
        this.power = false;
    }

    public void startUp() throws Exception{
        this.power = true;
        System.out.println("PSU has now put power to the computer");
        BIOS bios = new BIOS();
        bios.bootOptions();

    }
    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
