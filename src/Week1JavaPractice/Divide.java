package Week1JavaPractice;

public class Divide {
    public static void main(String[] args) {

        //divide without "/" operator

            division(0,5);

    }
    public static void division(double num1, double num2){

        if(num2 == 0){
            System.err.println("Error");
            System.exit(1);
        }

        int result = 0;
        while(num1>=num2){
            num1-=num2;
            result++;
        }
        System.out.println("Result: "+result+" and remainder: "+num1);



    }
}
