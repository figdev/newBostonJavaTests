/*
//number 14
public class tuna {
    public void simpleMessage() {
        System.out.println("This is another class");
        System.out.println("testing the saving");
    }
}
*/
/*
//number 15 {Use Methods with Parameters}

public class tuna {
    public void simpleMessage(String name){
        System.out.println("Hello " + name + "!");
    }
}
 */

/*
//number 16 {Many Methods and Instances}
public class tuna {
    private String girlName;
    public void setName(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first girlfriend was %s.", getName());
    }
}
 */

/*
//number 17 {Constructors}
public class tuna {
    private String girlName;

//    the constructor! makes object when it is created not null
    public tuna(String name){
        girlName = name;
    }

    public void setName (String name) {
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first girlfriend was %s.\n", getName());
    }
}
*/
/*
//number 18 {Nested if Statements}
public class tuna{
}
*/
/*
//      number 36       time class
public class tuna {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) {
        hour =      ((h>=0 && h<24) ? h : 0);
        minute =    ((m>=0 && m<60) ? m : 0);
        second =    ((s>=0 && s<60) ? s : 0);
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
*/
//      number 37 display regular time
public class tuna {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) {
        hour =      ((h>=0 && h<24) ? h : 0);
        minute =    ((m>=0 && m<60) ? m : 0);
        second =    ((s>=0 && s<60) ? s : 0);
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour==0||hour==12) ? 12 : hour % 12), minute, second, ((hour<12)?"AM":"PM"));
    }
}
