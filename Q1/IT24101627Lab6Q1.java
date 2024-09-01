import java.util.Scanner;
 public class IT24101627Lab6Q1  {
   public static void main(String[] args)  {

   Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number:");
    double number = sc.nextDouble();

    double squareOfNumber = number * number;
    double squareRootOfNumber = Math.sqrt(number);

    System.out.println("The square Of"+number+"is :"+squareOfNumber);
    System.out.println("The square root Of"+number+"is :"+squareRootOfNumber);

 }

 } 

