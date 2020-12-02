package jumptojava.chap04;

public class Ex02Switch {
    public static void main(String[] args) {
        int month = 12;
        String monthString;

        // 입력값이 정형화되어 있는 경우 if문보다는 switch/case문을 쓰는것이 가독성에서 좀 더 유리하다

        switch (month) {
            case 1:
                monthString = "January";
                break; // break문을 사용하지 않으면 다음 case문 실행
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default: // 그 외의 값이 저장되어 있다면 실행됨
                monthString = "Invalid month";
                break;
        }

        System.out.println(monthString);
    }
}
