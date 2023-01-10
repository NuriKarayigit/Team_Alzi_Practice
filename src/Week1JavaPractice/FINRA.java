package Week1JavaPractice;

public class FINRA {
   public static String Finra(int num){

       String result = "";
       for (int i = 1; i <=num ; i++) {
           if (i%3==0 && i%5==0){
               result+=" FINRA ";
           } else if (i%3==0 ) {
               result+= " FIN ";
           } else if (i%5==0) {
               result+=" RA ";
           }else {
               result+=i+" ";
           }
       }
       System.out.println(result);
       return result;

   }

    public static void main(String[] args) {
     Finra(30);
    }
    }

