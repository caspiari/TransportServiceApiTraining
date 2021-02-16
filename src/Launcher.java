import java.util.Date;
import java.util.HashSet;

public class Launcher extends Thread {

    private static Launcher instance = null;
    private HashSet<Transport> transports;

    private Launcher() {
        this.transports = new HashSet<>();
    }

    public static Launcher getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new Launcher();
        return instance;
    }

    @Override
    public void run() {
        Date now = new Date(System.currentTimeMillis());
        for (Transport transport : transports) {
            if (transport.getTime().before(now)) {
                if (transport.isBig()) {
                    launchBig(transport);
                } else {
                    launch(transport);
                }
                transports.remove(transport);
            }
        }
    }

    private void launchBig(Transport transport) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ride is out! (" + (i + 1) + (i == 1? "st" : "nd") + " car of 3): \n" + transport.toString());
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
