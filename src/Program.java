import java.util.Calendar;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Launcher launcher = Launcher.getInstance();

        Calendar time = Calendar.getInstance();
        time.setTime(new Date(System.currentTimeMillis() + 1000*60*60*30));
        for (int i = 0; i < 10; i++) {
            launcher.addTransport(new Transport("transport" + (i + 1), "here", "there", time, "", false));
        }

        Calendar time2 = Calendar.getInstance();
        time2.setTime(new Date(System.currentTimeMillis() - 1000*60*60*30));
        launcher.addTransport(new Transport("supposed to be first", "here", "there", time2, "", false));


        System.out.println(launcher.getTransports().size());
        for (Transport transport : launcher.getTransports()) {
            System.out.println(transport);
        }

//        BigTransportsLauncher btl = new BigTransportsLauncher(new Transport("here", "there", new Date(), "blabla", true));
//        btl.start();
    }
}
