import java.util.Scanner;
public class IT24101627Lab6Q2B {

      public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

            System.out.println("Please enter 10 numbers:");

          int numb = 1;
 
          while(numb <= 10) {

            System.out.print("Enter number" +numb+ ":"  );
            numb = sc.nextInt();
            numb = numb + 1;
             }

         System.out.print("The number you entered 10 are:");

           numb = 1;

          while(numb < 10) {

              System.out.println(numb + " ");
              numb = numb + 1;

          }
     }

}