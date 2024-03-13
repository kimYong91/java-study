package collection.set.compare_ex.ex1;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Reservation implements Comparable<Reservation> {
    private LocalDateTime start;
    private String name;
    private String place;

    public Reservation(LocalDateTime start, String place, String name) {
        this.start = start;
        this.place = place;
        this.name = name;
    }

    @Override
    public int compareTo(Reservation other) {
        return start.compareTo(other.getStart());
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "예약 시간 : " + start + ", 장소 : " + place + ", 이름 : " + name;
    }
}