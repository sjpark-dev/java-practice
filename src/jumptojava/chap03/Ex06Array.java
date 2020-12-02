package jumptojava.chap03;

public class Ex06Array {
    public static void main(String[] args) {
        int[] evens = {2, 4, 6, 8, 10};

        String[] week = new String[7];
        week[0] = "Mon";
        week[1] = "Tue";
        week[2] = "Wed";
        week[3] = "Thu";
        week[4] = "Fri";
        week[5] = "Sat";
        week[6] = "Sun";

        System.out.println(week[6]); // Sun

        // length
        String[] fruits = {"apple", "orange", "grape", "strawberry", "watermelon", "kiwi"};
        for (int i=0; i<fruits.length; i++) {
            System.out.print(fruits[i] + " "); // apple orange grape strawberry watermelon kiwi
        }
    }
}
