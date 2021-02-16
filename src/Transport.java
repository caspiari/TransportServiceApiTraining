import java.util.Date;

public class Transport {

    private String from;
    private String to;
    private Date time;
    private String details;
    private boolean big;
    private boolean went;

    public Transport(String from, String to, Date time, String details, boolean big) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.details = details;
        this.big = big;
        this.went = false;
    }

    @Override
    public String toString() {
        return "\nTransport{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", time=" + time +
                ", details='" + details + '\'' +
                ", big=" + big +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isBig() {
        return big;
    }

    public void setBig(boolean big) {
        this.big = big;
    }
}
