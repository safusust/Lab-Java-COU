import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Insert first number ");
        a=sc.nextInt();
        System.out.println("Insert second number");
        b=sc.nextInt();
        System.out.println("Quotient = "+a/b);
        System.out.println("Reminder = " +a%b);


    }
}
