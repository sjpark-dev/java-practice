package chap04;

public class Ex04For {
    public static void main(String[] args) {
        int[] marks = {90, 25, 67, 45, 80};

        for (int i=0; i<marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1) + "번 학생은 합격입니다.");
            } else {
                System.out.println((i+1) + "번 학생은 불합격입니다.");
            }
        }

        // for와 continue
        int[] scores = {90, 25, 67, 45, 80};

        for (int i=0; i<scores.length; i++) {
            if (scores[i] < 60) {
                continue;
            }
            System.out.println((i+1) + "번 학생 축하합니다. 합격입니다.");
        }

        // for와 break
        int[] levels = {1, 2, 3, 4, 5};

        for (int i=0; i<levels.length; i++) {
            if (levels[i] > 2) {
                break;
            }
            System.out.println("Your level is " + levels[i]);
        }

        // for를 이용한 구구단
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
