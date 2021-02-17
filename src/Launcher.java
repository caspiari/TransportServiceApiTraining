import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

public class Launcher extends Thread {

    private static Launcher instance = null;
    private TreeSet<Transport> transports;

    private Launcher() {
        this.transports = new TreeSet<>();
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
                    BigTransportsLauncher bigTransport = new BigTransportsLauncher(transport);
                    bigTransport.run();
                } else {
                    System.out.println("Ride is out!" + transport.toString());
                }
                transports.remove(transport);
            }
        }
    }

    public void addTransport(Transport transport) {
        this.transports.add(transport);
    }

    public void removeTransport(String name) {
        for (Transport transport : transports) {
            if (transport.getName().equalsIgnoreCase(name)) {
                transports.remove(transport);
            }
        }
    }

    public TreeSet<Transport> getTransports() {
        return transports;
    }

    public void setTransports(TreeSet<Transport> transports) {
        this.transports = transports;
    }
}
