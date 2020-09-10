import java.util.Arrays;
import java.util.Scanner;

public class September9Homework {

    /* 1) Create a program that keeps asking for a password
    Make sure you are using the Scanner Class/Object
    Once the user gets the password correct
    Print out a message to the user eg: logged in
    Keep track of how many wrong attempts they made
    Then display their number of wrong attempts */

    public static void loggingIn() {

        int counter = 0;
        String greeting = "Type in your password:";
        System.out.println(greeting);

        String correctPass = "JAVA GANG";

        //boolean indicator = false;

        Scanner passwordScan = new Scanner(System.in);
        String input2 = passwordScan.nextLine();

        /* while(indicator = false) */ {

            if (input2.equals(correctPass)) {
                System.out.println("eg: logged in");

                //indicator = true;

            } else {
                System.out.println("Error: Guess again homie!");

                //I tried my best to complete the remainder of the question but i got stuck :)
            }
        }
    }

    /* 2) Create a method that takes a price and a discount amount
    Calculate the final price after discounts*/

    public static double priceCalc(double price , double discount){
        return price -= (price * discount);
    }

    /* 3)Complete this method
    public int lengthOfStringMethod(String x){}*/

    public static int lengthOfStringMethod(String x){

        int stringLength = x.length();
        return stringLength;
    }
    // 4) Write a method that takes one parameter/argument and squares the number

    public static int getSquare(int num){

        return num * num;
    }

    /* 5) Write a while loop that prints only even numbers from 10 - 0
    but once the loop gets to 5 break out of the loop */

    public static void printEvenNums(){
        int x = 11;
          while (x >= 0)
        {
            x--;

            if(x == 5)
            {
                break;
            }

            if(x % 2 == 0)
            {
                System.out.println(x);
            }
        }
    }

    /* 6) Create a program that scans for a student's number grade number prints a student's letter grade based on the following conditions:
    if a student's grade is between 90 and 100 then print you got an A
    if a student's grade is between 89 and 80 then print you got a B
    if a student's grade is between 79 and 70 then print you got a C
    if a student's grade is between 69 and 60 then print you got an D
    if a student's grade is  59 and below then print you got an F*/

    public static void calcStudentGrades(){

        String opening = "What is your grade?";
                    System.out.println(opening);

        Scanner gradeScanner = new Scanner(System.in);
        int input = gradeScanner.nextInt();

        if (input <= 100 && input >= 90){
            System.out.println("A");
        }
        if (input <= 89 && input >= 80){
            System.out.println("B");
        }
        if (input <= 79 && input >= 70){
            System.out.println("C");
        }
        if (input <= 69 && input >= 60){
            System.out.println("D");
        }
        if (input <= 59 && input >= 0){
            System.out.println("F");
        }
        else {
            System.out.println("NOT A GRADE");
        }
    }

    /* 7) Create a method that prints from 45 - 0 however it should print the following:
            1 - print Year if the number is divisible by 3
            2 - print Up if the number is divisible by 5
            3 - Print YearUp if the number is divisible by both 3 and 5*/

            public static void yearUp(){
                for (int index2 = 45; index2 >= 0; index2--){

                    if (index2 % 3 == 0 && index2 % 5 == 0){
                        System.out.println("YearUp");
                    }
                    else if (index2 % 5 == 0){
                        System.out.println("Up");
                    }
                    else if (index2 % 3 == 0){
                        System.out.println("Year");
                    }
                    else{
                        System.out.println(index2);
                    }
                }
            }

            /* 8) Create an array of your top 5 artist
            Write a loop to print them all out! */

            public static void topFiveArtists(){

                String [] artists = {"Drake", "Lil Tjay","Lil Uzi","Summer","PND"};
                String list = "Top Five Artists:";

                System.out.println(list);

                for (int index = 0; index < artists.length; index++){

                    System.out.println(artists[index]);
                }
            }

            /* 5) Write a while loop that prints only even numbers from 10 - 0
               but once the loop gets to 5 break out of the loop */

            public static void printEvenNumbers(){
                int x = 11;
                while (x >= 0)
                {
                    x--;

                    if(x == 5)
                    {
                         break;
                    }

                        if(x % 2 == 0)
                    {
                        System.out.println(x);
                    }
                 }
            }

            //10) Create a method that calculates the circumference of a circle
            // C= 2 * PI * r

            public static void calcCir(double r){

                System.out.println(2 * Math.PI * r);
            }

            public static void main(String[] args) {

        /*1*/ loggingIn();
        /*2*/ System.out.println(priceCalc(100,0.10));
        /*3*/ System.out.println(lengthOfStringMethod("Hey, Whats up"));
        /*4*/ System.out.println(getSquare(3));
        /*5*/ printEvenNums();
        /*6*/ calcStudentGrades();
        /*7*/ yearUp();
        /*8*/ topFiveArtists();
        /*9*/ printEvenNumbers();
        /*10*/calcCir(3);

    }
}
