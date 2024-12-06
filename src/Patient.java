import java.time.LocalDate;
import java.time.LocalTime;

public class Patient {
    private final String name;
    private final LocalDate dob;
    private Severity severity;
    private LocalTime arrivalTime;

    public Patient(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() { return name; }
    public LocalDate getDob() { return dob; }
    public Severity getSeverity() { return severity; }
    public void setSeverity(Severity severity) { this.severity = severity; }
    public LocalTime getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(LocalTime arrivalTime) { this.arrivalTime = arrivalTime; }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', DOB=" + dob + ", severity=" + severity + ", arrivalTime=" + arrivalTime + "}";
    }
}

