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
/*
//      number 51       GUI with JFrame
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class tuna extends JFrame{
    private JLabel item1;

    public tuna(){
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("Hovering text, if seen");
        add(item1);
    }
}
*/
/*
//      number 52       event handling

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public tuna(){
        super("The title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);
    }
}
*/
/*
//      number 53       ActionListner

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public tuna(){
        super("The title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    private class theHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string ="";
            if (event.getSource()==item1)
                string=String.format("field 1: %s", event.getActionCommand());
            else if (event.getSource()==item2)
                string=String.format("field 2: %s", event.getActionCommand());
            else if (event.getSource()==item3)
                string=String.format("field 3: %s", event.getActionCommand());
            else if (event.getSource()==passwordField)
                string = String.format("password field is : %s", event.getActionCommand());
        }
    }
}
*/
/*
//      number 54       event handler program

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public tuna(){
        super("The title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
    private class theHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string ="";
            if (event.getSource()==item1)
                string=String.format("field 1: %s", event.getActionCommand());
            else if (event.getSource()==item2)
                string=String.format("field 2: %s", event.getActionCommand());
            else if (event.getSource()==item3)
                string=String.format("field 3: %s", event.getActionCommand());
            else if (event.getSource()==passwordField)
                string = String.format("password field is : %s", event.getActionCommand());

            JOptionPane.showMessageDialog(null, string);
        }
    }
}
*/
/*
//      number 55       introduction to polymorphism
public class tuna extends food{
    void eat(){
        System.out.println("this tuna is great");
    }
}
*/
/*
//      number 57       overriding rules
public class tuna extends food{
    void eat(){
        System.out.println("this tuna is great");
    }
}
*/
//      number 58 Abstract and Concrete classes
/*
public class tuna extends food{
    void eat(){
        System.out.println("this tuna is great");
    }
}
*/
