package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student> {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public int compareTo(Student o) {
        return getScore() - o.getScore();
    }
}

public class CompararblePractice {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(100), new Student(90),
                new Student(95), new Student(80), new Student(85), new Student(100),
                new Student(90), new Student(100), new Student(80), new Student(85));

        String beforeSort = students.stream().map(x -> String.valueOf(x.getScore()))
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("before sort: " + beforeSort);

        Collections.sort(students);

        String afterSort = students.stream().map(x -> String.valueOf(x.getScore()))
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("after sort: " + afterSort);

        double average = students.stream().collect(Collectors.averagingInt(Student::getScore));
        System.out.println("average score: " + average);
    }
}
