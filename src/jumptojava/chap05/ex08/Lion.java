package jumptojava.chap05.ex08;

public class Lion extends Predator implements Barkable {

    @Override
    public String getFood() {
        return "banana";
    }

    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}
