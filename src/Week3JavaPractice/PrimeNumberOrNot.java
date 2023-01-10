package Week3JavaPractice;

import java.util.InputMismatchException;

public class PrimeNumberOrNot {
    public static void PrimeOrNot(int number) {
        boolean isPrime = true;
        for (int i = 2; i <number ; i++) {

            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        if (number<=1){
isPrime=false;        }
if (isPrime){
    System.out.println(number+" is prime number");
} else {
    System.out.println(number+" is not prime");
}
}


    public static void main(String[] args) {
        PrimeOrNot(9);
    }
}
