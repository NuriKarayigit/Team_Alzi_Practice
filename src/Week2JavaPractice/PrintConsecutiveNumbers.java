package Week2JavaPractice;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {

        int n = 24;


        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0) result = result + " Codility ";
                if (i % 3 == 0) result = result + " Test ";
                if (i % 5 == 0) result = result + " Coders ";
                System.out.print(" "+result+" ");
            } else
                System.out.print(i);
        }
    }
}
