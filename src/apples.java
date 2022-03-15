/**
      calculator
class newBoston {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.print("Enter first num: ");
        fnum = bucky.nextDouble();
        System.out.print("Enter second num: ");
        snum = bucky.nextDouble();
        answer = fnum + snum;
        System.out.print(answer);
    }
}
 **/
/*
    math operators
class newBoston {
    public static void main(String[] args){
        int girls, boys, people;
        girls = 6;
        boys = 3;
        people = girls + boys;
    }
}
 */
/*
class newBoston{
    public static void main(String[] args){
        Scanner bucky = new Scanner(System.in);

        int tuna = 5;
        int bass = 18;
        System.out.println(tuna++);
    }
} **/

/*
class newBoston {
    public static void main(String[] args){
        int test = 6;

        if (test != 9) System.out.print("yes");
        else System.out.println("this is else dummy");
    }
}
 */

/*
// number 12
class newBoston{
    public static void main(String[] args){
        int age = 3;
        switch (age) {
            case 1 -> System.out.println("you are one");
            case 2 -> System.out.println("you are two");
            case 3 -> System.out.println("You are 3");
            default -> System.out.println("you messed up bro");
        }
    }
}
 */

/*
// number 13
class newBoston {
    public static void main(String[] args){
        int counter = 0;
        while (counter < 10) {
            System.out.println(++counter);
        }
        System.out.print("Ended on: " + counter);
    }
}
*/

/*
//number 14
class apples {
    public static void main(String[] args){
        tuna tunaObject = new tuna();
        tunaObject.simpleMessage();
    }
}
*/
/*
//number 15 {Use Methods with Parameters}
import java.util.Scanner;

class apples {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            tuna tunaObject = new tuna();

            System.out.print("Enter your name here: ");
            String name = input.nextLine();

            tunaObject.simpleMessage(name);
    }
}
/
 */
/*
//number 16 {Many Methods and Instances}
import java.util.Scanner;

class apples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna();
        System.out.print("Enter name of first girlfriend here: ");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();
    }
}
 */

/*
//number 17 {Constructors}
class apples {
    public static void main(String[] args){
        tuna tunaObject = new tuna("Kelsey");
        tuna tunaObject2 = new tuna("Nicky");
        tunaObject.saying();
        tunaObject2.saying();
    }
}
*/

/*//number 18 {Nested if Statements}
class apples {
    public static void main(String[] args){
        int age = 60;

        if (age < 50) {
            System.out.println("You are young.");
        }
        else {
            System.out.println("You are old!");
            if (age > 75) {
                System.out.println("You are REALLY old!");
            }
            else {
                System.out.println("Don\'t worry, you aren\'t really that old.");
            }
        }
    }
}*/
/*
//number 19 {else if statement}
class apples {
    public static void main(String[] args) {

        int age = 25;

        if (age > 60)
            System.out.println("You are a senior citizen.");
        else if (age >= 50)
            System.out.println("You are in your 50\'s.");
        else if (age >= 40)
            System.out.println("You are in your 40\'s.");
        else
            System.out.println("You are a young buck.");
    }
}
*/
/*
//number 20 conditional operators
class apples {
    public static void main(String[] args){
        int age = 20;
        System.out.println(age > 50 ? "You are old" : "You are young");
//       condition ? true statement : false statement
    }
}
*/

/*
//number 21 simper averaging program
import java.util.Scanner;

class apples {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0, counter = 0;
        int grade, average;

        while (counter < 3){
            grade = input.nextInt();
            total += grade;
            counter++;
        }
        average = total/3;
        System.out.printf("Your average is %d", average);
    }
}*/

/*//number 22 for loops
class apples {
    public static void main(String[] args){
        float monkeyError = 0;
        for(float counter = 1; counter <= 100; counter += 0.1){
            System.out.println(counter);
            monkeyError = counter;
        }
        System.out.println(monkeyError);
    }
}*/

/*
// 23 compound interest program
//    easy dub, formatting in printf is fun!
class apples {
    public static void main(String[] args) {
//        A = P(1+r)^n
//        formula
        double amount, principal = 10000;
        double rate = 0.01; // 1% a day
        for(int day=1; day <= 20; day++) {
            amount = principal * (Math.pow(1 + rate, day));
            System.out.printf("%d   %.2f\n", day, amount);
        }
    }
}*/
/*//    number 24 do while loops
class apples {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);
    }
}*/
/*
//  number 25 math class methods
class apples {
    public static void main(String[] args) {
        System.out.println(Math.abs(-26.7)); // makes positive
        System.out.println(Math.ceil(-26.7)); //takes higher rounding
        System.out.println(Math.ceil(12.4));
        System.out.println(Math.floor(23.45)); //takes lower rounding
        System.out.println(Math.floor(-45.66));
        System.out.println(Math.max(8.6, 5.2)); //takes higher value
        System.out.println(Math.min(5.1, 4.3)); //takes lesser value
        System.out.println(Math.pow(5, 3)); // x to the power of y
        System.out.println(Math.sqrt(9)); // square root of x

        System.out.printf("%.1f\n", Math.sqrt(56));
        System.out.printf("%.6f\n", Math.sqrt(56));

    }
}*/
//  number 26 random number generator
//    bucky is cool
    import java.util.Random;
class apples {
    public static void main(String[] args) {
        Random roll = new Random();
        int dice;
        for(int counter = 1; counter <= 10; counter++) {
            dice = 1 + roll.nextInt(6);
            System.out.println(dice + " ");
        }
    }
}