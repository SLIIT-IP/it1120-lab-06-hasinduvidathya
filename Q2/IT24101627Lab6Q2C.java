import java.util.Scanner;
public class IT24101627Lab6Q2C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");

        int numb = 0;
        int sum = 0;

        while(numb < 10) {

            System.out.print("Enter number" +(numb+1)+ ": "  );
            numbers[numb] = sc.nextInt();
            numb = numb + 1;
        }

        System.out.println("\nThe number you entered are:");

        numb = 0;

        while(numb < 10) {

            System.out.print(numbers[numb] + " ");
            sum = sum + numbers[numb];
            numb = numb + 1;

        }
            System.out.println("\nSum of the numbers: " +sum);

        double avg = sum /10.0;
            System.out.println("Average of the numbers: "+avg);
    }

}