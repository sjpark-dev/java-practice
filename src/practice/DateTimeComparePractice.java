package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DateTimeComparePractice {
    public static void main(String[] args) {
        String oldDateTimeString = "2020-12-16 12:00";
        String newDateTimeString = "2020-12-16 12:00";
        DateTimeFormatter localTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime oldDateTime = LocalDateTime.parse(oldDateTimeString, localTimeFormat);
        LocalDateTime newDateTime = LocalDateTime.parse(newDateTimeString, localTimeFormat);
        System.out.println(oldDateTime.isAfter(newDateTime));
        System.out.println(oldDateTime.isBefore(newDateTime));
        System.out.println(oldDateTime.isEqual(newDateTime));

        List<Order> orders = new ArrayList<>(Arrays.asList(
                new Order("2020-12-16 12:00", "John"),
                new Order("2020-12-16 11:00", "Peter"),
                new Order("2020-12-16 11:30", "Sarah"),
                new Order("2020-12-16 12:00", "Donut"),
                new Order("2020-12-16 12:10", "Ellison")
        ));

        orders.stream().sorted()
                .forEach(order -> System.out.println(
                        order.getTimeOfOrder().format(localTimeFormat) + " " +  order.getCustomer()
                ));

        Collections.sort(orders);

        orders.forEach(order -> System.out.println(
                order.getTimeOfOrder().format(localTimeFormat) + " " +  order.getCustomer()
        ));
    }
}

class Order implements Comparable<Order> {
    private static final DateTimeFormatter localTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private LocalDateTime timeOfOrder;
    private String customer;

    public Order(String timeOfOrder, String customer) {
        this.timeOfOrder = LocalDateTime.parse(timeOfOrder, localTimeFormat);
        this.customer = customer;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }

    public String getCustomer() {
        return customer;
    }

    @Override
    public int compareTo(Order order) {
        if (timeOfOrder.isBefore(order.getTimeOfOrder())) {
            return -1;
        }
        if (timeOfOrder.isAfter(order.getTimeOfOrder())) {
            return 1;
        }
        return 0;
    }
}
