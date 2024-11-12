import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.1416;
        double radius= sc.nextDouble();
        double area=pi*radius*radius;
        double circumference=2*pi*radius;
        System.out.println("Area = "+area);
        System.out.println("Circmference = " +circumference);

    }
}
