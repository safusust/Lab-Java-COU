import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean t= true;
        while(t){
            int a=sc.nextInt();
            if(a==0)break;
            if(a>=80) System.out.println("A");
            else if(a>=60) System.out.println("B");
            else if(a>=40) System.out.println("C");
            else System.out.println("D");
        }
    }
}
