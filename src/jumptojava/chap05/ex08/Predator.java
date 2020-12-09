package jumptojava.chap05.ex08;

public abstract class Predator extends Animal {
    public abstract String getFood();

    public boolean isPredator() {
        return true;
    }
}
