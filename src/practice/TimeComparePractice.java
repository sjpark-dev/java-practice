package practice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimeComparePractice {
    public static void main(String[] args) {
        String oldTimeString = "17:30:25";
        String newTimeString = "17:30:30";
        DateTimeFormatter localTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime oldTime = LocalTime.parse(oldTimeString, localTimeFormat);
        LocalTime newTime = LocalTime.parse(newTimeString, localTimeFormat);
        System.out.println(oldTime + "\n" + newTime);
        System.out.println(oldTime.isAfter(newTime));
        System.out.println(oldTime.isBefore(newTime));

        List<Ticket> tickets = new ArrayList<>(Arrays.asList(
                new Ticket("John", LocalTime.parse("17:50:30",localTimeFormat)),
                new Ticket("Peter", LocalTime.parse("17:55:30",localTimeFormat)),
                new Ticket("Donut", LocalTime.parse("17:52:30",localTimeFormat)),
                new Ticket("Alice", LocalTime.parse("17:50:30",localTimeFormat)),
                new Ticket("Fred", LocalTime.parse("17:51:30",localTimeFormat))
        ));

        Collections.sort(tickets);

        tickets.forEach(ticket -> System.out.println(ticket.getPurchaseTime() + " " + ticket.getOwner()));
    }
}

class Ticket implements Comparable<Ticket> {
    private String owner;
    private LocalTime purchaseTime;

    public Ticket(String owner, LocalTime purchaseTime) {
        this.owner = owner;
        this.purchaseTime = purchaseTime;
    }

    public String getOwner() {
        return owner;
    }

    public LocalTime getPurchaseTime() {
        return purchaseTime;
    }

    @Override
    public int compareTo(Ticket ticket) {
        if (this.purchaseTime.isAfter(ticket.getPurchaseTime())) {
            return 1;
        }
        if (this.purchaseTime.isBefore(ticket.getPurchaseTime())) {
            return -1;
        }
        return 0;
    }
}
