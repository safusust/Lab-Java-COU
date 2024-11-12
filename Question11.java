import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p,r,t,n;
        System.out.println("Input Principle amount ");
        p=sc.nextDouble();
        System.out.println("Input rate per annum");
        r=sc.nextDouble();
        System.out.println("input time");
        t=sc.nextDouble();
        System.out.println("Number of time");
        n=sc.nextDouble();

        double m=1+(r/n);
        double total=Math.pow(m,n*t);
        double ans=p*total-p;
        System.out.println("Compound Interest ="+ans);

    }
}
