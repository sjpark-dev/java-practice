package chap05.ex03;

class Updater {

    // called by value
    public void update1(int count) { // 값(int 자료형)을 전달 받는다
        count++;
    }

    // called by reference
    public void update2(Counter counter) { // 객체(counter)를 전달 받는다
        counter.count++;
    }
}

public class Counter {
    int count = 0;
}
