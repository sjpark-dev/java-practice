package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckSameName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] namesInStringArray = scanner.nextLine().split(" ");
        ArrayList<String> namesInArrayList = new ArrayList<>(Arrays.asList(namesInStringArray));
        int length = namesInArrayList.size();

        for (int i = 0; i < length; i++) {
            String name = namesInArrayList.remove(i);
            if (namesInArrayList.contains(name)) {
                System.out.println("same name exits");
            }
            namesInArrayList.add(i, name);
        }
    }
}
