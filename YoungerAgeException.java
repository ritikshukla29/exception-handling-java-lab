import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

class Voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("you are not eligible for voting");
            } else {
                System.out.println("you can vote successfully");
            }
        } catch (YoungerAgeException e) {
            e.printStackTrace();
        }
        System.out.println("Hell0");
    }
}
