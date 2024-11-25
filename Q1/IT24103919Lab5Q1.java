import java.util.Scanner;
public class IT24103919Lab5Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("enter the first integer");
        int number1 = input.nextInt();
        int smallest = number1;
        int largest = number1;

               
        System.out.print("enter the second integer");
        int number2 = input.nextInt();
        if (number2 < smallest) {
            smallest = number2;
        }

        if (number2 > largest) {
            largest = number2;
        }
             
        System.out.print("enter the third integer");
        int number3 = input.nextInt();
        if (number3 < smallest) {
            smallest = number3;
        }
	    if (number3 > largest) {
		    largest = number3;
	    }

        System.out.println("User entered number are :"+ number1 + " " + number2 + " " + number3);
        System.out.println("The smallest number is :" + smallest);
        System.out.println("The largest number is :" + largest);

    }
}