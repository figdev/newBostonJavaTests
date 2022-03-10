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

//number 15 {Use Methods with Parameters}
import java.util.Scanner;

class apples {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna();

        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        tunaObject.simpleMessage(name);
    }
}