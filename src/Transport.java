import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Transport implements Comparable<Transport> {

    private String name;
    private String from;
    private String to;
    private Calendar time;
    private String details;
    private boolean big;

    public Transport(String name, String from, String to, Calendar time, String details, boolean big) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.time = time;
        this.details = details;
        this.big = big;
    }

    @Override
    public String toString() {
        return "\nTransport{" +
                "name='" + name +
                "', from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", time=" + time.getTime() +
                ", details='" + details + '\'' +
                ", big=" + big +
                '}';
    }

    @Override
    public int compareTo(Transport t) {
        if (this.time.get(Calendar.DAY_OF_WEEK) == t.getTime().get(Calendar.DAY_OF_WEEK) && this.name.equalsIgnoreCase(t.getName())) {
            return 0;
        }
        return this.time.getTimeInMillis() - t.time.getTimeInMillis() > 0? 1 : -1;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Transport transport = (Transport) o;
//        return name.equalsIgnoreCase(transport.getName()) && time.get(Calendar.DAY_OF_WEEK) == transport.getTime().get(Calendar.DAY_OF_WEEK);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, time.get(Calendar.DAY_OF_WEEK));
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
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
