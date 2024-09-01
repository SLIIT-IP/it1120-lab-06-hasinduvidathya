import java.util.Scanner;

public class IT24101627Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integers (Terminate input with -99):");

        double rms = 0;
        double sum = 0;
        double count = 0;
        double num = 0;

        while (true) {
            System.out.print("Enter a number: ");
            num = sc.nextDouble();

            if (num == -99) {
                break;
            } else if (num > 0) {
                double sq = Math.pow(num, 2);
                sum += sq;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
        }

        if (count > 0) {
            rms = Math.sqrt(sum / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No positive integers were entered.");
        }

        
    }
}
