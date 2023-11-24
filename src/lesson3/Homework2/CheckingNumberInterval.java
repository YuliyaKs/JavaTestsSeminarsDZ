package lesson3.Homework2;

public class CheckingNumberInterval {

//    public static void main(String[] args) {
//        CheckingNumberInterval numbers = new CheckingNumberInterval();
//        System.out.println(numbers.numberInInterval(26));
//        System.out.println(numbers.numberInInterval(99));
//        System.out.println(numbers.numberInInterval(25));
//        System.out.println(numbers.numberInInterval(100));
//    }

    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}
