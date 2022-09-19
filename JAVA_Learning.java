import java.util.Scanner;

public class JAVA_Learning
{
    public static void main(String[] args)
    {
        // Exercise 1 -----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("\nE1 - Print all numbers from 1 to 100");
        System.out.println("""
                Update with FizzBuzz!
                Write a program that prints the numbers from 1 to 100.
                For the multiples of 3 print "Fizz" and for the multiples of 5 print "Buzz" instead
                For the numbers that are multiples of both 3 and 5 print "FizzBuzz"
                """);
        int i;
        for (i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 & i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0 & i % 5 != 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
                System.out.println(i+" ");

        // Exercise 2 -----------------------------------------------

        int[] Array = {34, 4, 63, 12, 85}; // #how to initialise an array.
        System.out.println("\nE2 - Find the secont biggest number in array");
        System.out.println("Our string is: " +
                "" + Array[0] + " " + Array[1] + " " + Array[2] + " " + Array[3] + " " + Array[4]);
        int no_elements = Array.length;
        int temporary;
        int j;
        for (i = 0; i < no_elements; i++)
        {
            for (j = i + 1; j < no_elements; j++)
            {
                if (Array[i] < Array[j])
                {
                    temporary = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temporary;
                }
            }
        }
        System.out.println(Array[no_elements - 4]);

        // Exercise 3 -----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("\nE3 - Voting eligibility");
        System.out.println("\n Please enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();


        while (age < 0 || age > 120)
        {
            System.out.println("The age you entered may be wrong." +
                    "\nPlease enter your age again:");
            age = sc.nextInt();
        }
        if (age < 18)
        {
            System.out.println("Only people above 18 are eligible to vote.");
        }
        else {
            System.out.println("You are eligible to vote!");
        }

        // Exercise 4 ----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("""

                E4 - What does the following code segment do?
                i = 1;
                int n = 5;
                while (i <= n)
                {
                    System.out.print(i);
                    i++;
                }""");
        // Found out that ' (""" """) ' is a method to print a text block.
        /*
        i = 1;
        int n = 5;
        while (i <= n)
        {
            System.out.print(i);
            i++;
        }
        */
        System.out.println("\n The code segment increases the value of 'i' from 1 to 'n'(5)" +
                "with the step equal to 1");

        // Exercise 5 ----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("\nE5 - What does the following code segment do?");
        System.out.println("""
                
                E5 - What does the following code segment do?
                int lst[] = {3, 5, 9, 11};
                        i = 0;
                        while (i < lst.length)
                        {
                            System.out.println(lst[i]);
                            i = i + 1;
                        }
                """);
        /*
        int lst[] = {3, 5, 9, 11};
        i = 0;
        while (i < lst.length)
        {
            System.out.println(lst[i]);
            i = i + 1;
        }
        */
        System.out.println("\n Answer: It prints the elements of the string 'lst[]'");

        // Exercise 6 ----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("\nE6 - Enter, verify and add 2 odd numbers");

        int a,b;
        System.out.println("\n Please enter the first odd number: ");
        a = sc.nextInt();
        while (a %2 == 0)
        {
            System.out.println("\n This number is even. Please enter an odd number: ");
            a = sc.nextInt(); // How I made sure that the entered 'a' is odd.
        }
        System.out.println("\n Please enter the second odd number: ");
        b = sc.nextInt();
        while (b %2 == 0)
        {
            System.out.println("\n This number is even. Please enter an odd number: ");
            b = sc.nextInt();
        }
        System.out.println(a + " " + b + " = " + (a + b));

        // Exercise 7 ----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("\nE7 - Aria of a circle with a given radius (cm)");

        System.out.println("\n Please enter the radius: ");
        int radius = sc.nextInt();
        double Circle = Math.PI * radius * radius;
        System.out.println("The aria of our circle is: " + Circle + " cm");

        // Exercise 8 ----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("""
                E8 - Give two numbers (length and width). Verifi if it is a square and
                     calculate its perimeter and area.""");

        String shape = "RECTANGLE";
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter width: ");
        int width = sc.nextInt();
        if (length == width)
        {
            shape = "SQUARE";
            System.out.println("\nThis is a square!");
        }
        int perimeter = (width * 2) + (length * 2);
        System.out.println("The " + shape + "S perimeter is: " + perimeter + " cm.");
        int aria = width * length;
        System.out.println("The " + shape + "S area is: " + aria + " cm^2.");
        
    }
}
