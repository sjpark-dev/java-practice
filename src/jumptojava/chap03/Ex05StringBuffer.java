package jumptojava.chap03;

public class Ex05StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.toString()); // Hello

        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        sb1.append(" ");
        sb1.append("World");
        System.out.println(sb1.toString()); // Hello World

        StringBuffer sb2 = new StringBuffer();
        sb2.append("World");
        sb2.insert(0, "Hello ");
        System.out.println(sb2.toString()); // Hello World

        StringBuffer sb3 = new StringBuffer();
        sb3.append("Hello World");
        System.out.println(sb3.substring(0, 5)); // Hello
    }
}
