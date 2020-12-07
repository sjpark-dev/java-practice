package practice;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.*;

public class CheckSameName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] namesInStringArray = scanner.nextLine().split(" ");

        // 방법 1
        ArrayList<String> namesInArrayList = new ArrayList<>(Arrays.asList(namesInStringArray));
        int length = namesInArrayList.size();

        for (int i = 0; i < length; i++) {
            String name = namesInArrayList.remove(i);
            if (namesInArrayList.contains(name)) {
                System.out.println("same name exists");
            }
            namesInArrayList.add(i, name);
        }

        // 방법 2
        Set<String> namesSet = new HashSet<>(Arrays.asList(namesInStringArray));

        if (namesInStringArray.length == namesSet.size()) {
            System.out.println("Unique");
        } else {
            System.out.println("same name exists");
        }
    }
}
