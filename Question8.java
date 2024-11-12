import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
       ArrayList<String>s= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of string you would like to enter :");
        int a;
        a=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<a;i++){
            String s1=sc.nextLine();
            s.add(s1);
        }
        s.sort((x,y)->{return 1*x.compareTo(y);});
        System.out.println(s);
    }
}
