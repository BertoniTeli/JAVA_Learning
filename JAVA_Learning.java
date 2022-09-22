import java.util.Arrays;
import java.util.Scanner;

public class JAVA_Learning
{
    private static String RomanNuneral;
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
                \nE8 - Give two numbers (length and width). Verifi if it is a square and
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
        
        // Exercise 9 ----------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("""
                \nE9 - Check the given string to determine whether one is an ANAGRAM of the other;
                       Example: All the letters of "Desperation" can be rearranged to form the
                       phase "A rope ends it".""");

        String S1 = "Desperation";
        String S2 = "A rope ends it";

        char A;
        char B;

        // First let's get rid of the spaces and the upper cases.
        S2 = S2.replace(" ", "");
        S1 = S1.toLowerCase();
        S2 = S2.toLowerCase();

        char[] S1A = S1.toCharArray();
        char[] S2A = S2.toCharArray();

        // Now for the comparison...
        if (S1.length() == S2.length())
        {
            System.out.println("\nThe strings have the same number of characters.");

        }
        else
        {
            System.out.println("\nNo anagram posible! The two strings have different number of characters.");
        }

        /* Throughout the for loop, whenever a letter from first array matches another from second array,
        the two letters are changed with "w".*/
        for (i = 0; i < S1.length(); i++)
        {
            A = S1A[i];
            for (j = 0; j < S2.length(); j++)
            {
                B = S2A[j];
                if (A == B)
                {
                    S2A[j] = 'w';
                    break;
                }
            }
            S1A[i] = 'w';
        }

        if (Arrays.equals(S1A, S2A))
        {
            System.out.println("\nThe two stings are anagramt to one another.");
        }
        else
        {
            System.out.println("\nNo anagram posible!");
        }

        // Exercise 10 ---------------------------------------------

        System.out.println("-----------------------------------------------");
        System.out.println("""
                \nE10 - Give a number between 1 and 3000. Convert the number to Roman nunerals.
                  I = 1 | V = 5 | X = 10 | L = 50 | C = 100 | D = 500 | M = 1000
                  Example: 2,421 = MM + CD + XX + I = MMCDXXI.""");

        System.out.println("Insert a number between 1 and 3000 : ");
        StringBuilder N1 = new StringBuilder();
        String N2 = "";
        String N3 = "";
        String N4 = "";
        int LatinNumber = 0;
        int NUMBER = sc.nextInt();
        int InitialNumber = NUMBER;

        while (NUMBER >= 1000)
        {
            NUMBER -= 1000;
            N1.append("M");
        }
        if (NUMBER >= 100)
        {
            LatinNumber = NUMBER / 100;
            N2 = RomanNuneralCalculator(LatinNumber, "M", "D", "C");
            NUMBER = NUMBER - LatinNumber * 100;
        }
        if (NUMBER >= 10)
        {
            LatinNumber = NUMBER / 10;
            N3 = RomanNuneralCalculator(LatinNumber, "C", "L", "X");
            NUMBER = NUMBER - LatinNumber * 10;
        }
        if (NUMBER >= 1)
        {
            LatinNumber = NUMBER;
            N4 = RomanNuneralCalculator(LatinNumber, "X", "V", "I");
        }
        System.out.println("\nNumber " + InitialNumber + " in Roman Numbers is: " + N1 + N2 + N3 + N4);

    }
    public static String RomanNuneralCalculator(int LatinNumber, String UPPER, String MIDDLE, String LOWER)
    {
        if (LatinNumber == 9)
        {
            RomanNuneral = LOWER + UPPER;
        }
        else if (LatinNumber >= 5)
        {
            RomanNuneral = MIDDLE + LOWER.repeat(LatinNumber - 5);
        }
        else if (LatinNumber == 4)
        {
            RomanNuneral = LOWER + MIDDLE;
        }
        else if (LatinNumber >= 1)
        {
            RomanNuneral = LOWER.repeat(LatinNumber);
        }
        return RomanNuneral;
    }
}
