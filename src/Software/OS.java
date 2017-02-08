package Software;
import java.util.Properties;

/**
 * Created by jona0 on 08-02-17.
 */
public class OS {
        private String name;
        private String version;

    public OS() {
        Properties p = System.getProperties();
        this.name = p.getProperty("os.name");
        this.version = p.getProperty("os.version");
    }

    public void startUp() throws Exception {
        System.out.println("The OS is now starting");
        for(int i = 0; i <= 5; i++){
            Thread.sleep(1000);
            System.out.println("*");
        }
        System.out.println("All operations is now complete, the computer has started");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
