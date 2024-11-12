import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,r,t;
        System.out.println("Input Principle amount ");
        p=sc.nextInt();
        System.out.println("Input rate per annum");
        r=sc.nextInt();
        System.out.println("input time");
        t=sc.nextInt();
        int total=p*r*t/100;
        System.out.println("Simple interest ="+total);


    }
}
