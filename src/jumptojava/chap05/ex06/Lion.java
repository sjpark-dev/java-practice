package jumptojava.chap05.ex06;

public class Lion extends Animal implements Predator {

    @Override
    public String getFood() {
        return "banana";
    }
}
