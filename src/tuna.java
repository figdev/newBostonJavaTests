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
/*
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
*/
/*
//      number 38 public, private and this
public class tuna {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) {
        this.hour =      ((h>=0 && h<24) ? h : 0);
        this.minute =    ((m>=0 && m<60) ? m : 0);
        this.second =    ((s>=0 && s<60) ? s : 0);
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour==0||hour==12) ? 12 : hour % 12), minute, second,
                ((hour<12)?"AM":"PM"));
    }
}
*/
/*
//      number 39   multiple constructors
public class tuna {
    private int hour;
    private int minute;
    private int second;

    public tuna() {
        this(0,0,0);
    }
    public tuna(int h){
        this(h,0,0);
    }
    public tuna(int h, int m){
        this(h,m,0);
    }
    public tuna(int h,int m,int s){
        setTime(h,m,s);
    }
    public void setTime(int h,int m,int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
}
*/
/*
//      40      set and get methods
public class tuna {
    private int hour;
    private int minute;
    private int second;

    public tuna() {
        this(0,0,0);
    }
    public tuna(int h){
        this(h,0,0);
    }
    public tuna(int h, int m){
        this(h,m,0);
    }
    public tuna(int h,int m,int s){
        setTime(h,m,s);
    }
    public void setTime(int h,int m,int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        hour = ((h>=0&&h<24)?h:0);
    }
    public void setMinute(int m){
        minute = ((m>=0&&m<60)?m:0);
    }
    public void setSecond(int s){
        second = ((s>=0&&s<60)?s:0);
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toMilitary() {
        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }
}
*/
/*
//      number 41       building objects for constructors
public class tuna {
    private int hour;
    private int minute;
    private int second;

    public tuna() {
        this(0,0,0);
    }
    public tuna(int h){
        this(h,0,0);
    }
    public tuna(int h, int m){
        this(h,m,0);
    }
    public tuna(int h,int m,int s){
        setTime(h,m,s);
    }
    public void setTime(int h,int m,int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        hour = (((h >= 0) && (h < 24)) ? h : 0);
    }
    public void setMinute(int m){
        minute = ((m>=0&&m<60)?m:0);
    }
    public void setSecond(int s){
        second = ((s>=0&&s<60)?s:0);
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toMilitary() {
        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }
}
*/
/*
//      number 43       composition
public class tuna {
    private String name;
    private potpie birthday;

    public tuna(String theName, potpie theDate) {
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s.", name, birthday);
    }
}
*/
/*
//      number 44       enumeration
public enum tuna {
    bucky("nice", "22"),
    kelsey("cute", "10"),
    julia("mistake", "12");
//    built in array: tuna.values()

    private final String desc;
    private final String year;

    tuna(String description, String birthday) {
        desc = description;
        year = birthday;
    }

    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }
}
*/
/*
//      number 45       EnumSet range
public enum tuna {
    bucky("nice", "22"),
    kelsey("cute", "10"),
    julia("mistake", "12"),
    nicole("italian", "13"),
    candy("different", "14"),
    erin("i wish", "16");
//    built in array: tuna.values()

    private final String desc;
    private final String year;

    tuna(String description, String birthday) {
        desc = description;
        year = birthday;
    }

    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }
}
*/
/*
//      number 46       Static
public class tuna{
    private final String first;
    private final String last;
    private static int members = 0;

    public tuna(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club: %d\n",
                first, last, members);
    }
}
*/
/*
//      number 47       More on Static
public class tuna{
    private final String first;
    private final String last;
    private static int members = 0;
//          static means shared among objects

    public tuna(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club: %d\n",
                first, last, members);
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
}
*/
/*
//      number 48       final
public class tuna{
    private int sum;
    private final int NUMBER;

    public tuna (int x){
        NUMBER = x;
    }
    public void add(){
        sum+=NUMBER;
    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}
*/
/*
//      number 49       inheritance
public class tuna extends food{
    public void eat(){
        System.out.println("I am the new method from tuna.");
    }
//          overrides food super class method!
}
*/
//      number 51       GUI with JFrame
public class tuna{

}