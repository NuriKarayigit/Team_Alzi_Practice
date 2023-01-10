package Week3JavaPractice;

public class ArmstrongNumbers {
    public static void isArmstrong(int number) {
        boolean isArmstrong = true;

        int first = number % 10; // first digit
        int second = number / 10 % 10;
        int third = number / 100;

        int result = (int) (Math.pow(first, 3) + Math.pow(second, 3) + Math.pow(third, 3));
        for (int i = 0; i < 1000; i++) {
            if (i == result) {
                isArmstrong=true;
            } else {
                isArmstrong=false;
            }
        }
        if(isArmstrong){
            System.out.println(number+" is an armstrong number");
        } else {
            System.out.println(number+" is not an armstrong number");
        }


    }

    public static void main(String[] args) {
        isArmstrong(100);
    }
}
