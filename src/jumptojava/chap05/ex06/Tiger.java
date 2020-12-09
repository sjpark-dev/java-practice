package jumptojava.chap05.ex06;

public class Tiger extends Animal implements Predator{

    @Override
    public String getFood() {
        return "apple";
    }
}
