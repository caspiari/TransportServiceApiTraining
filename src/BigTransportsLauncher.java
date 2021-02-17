public class BigTransportsLauncher extends Thread {

    private Transport transport;

    public BigTransportsLauncher(Transport transport) {
        this.transport = transport;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ride is out! (" + (i + 1) + (i == 1 ? "st" : "nd") + " car of 3):" + transport.toString());
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "BigTransports{" +
                "transport=" + transport +
                '}';
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
