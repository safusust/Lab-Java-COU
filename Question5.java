import java.util.Scanner;

class Product{
    int id;
    String title;
    String description;
    double quantity;
    double price;
}
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p1= new Product();

        System.out.println("Insert title");
        p1.title=sc.nextLine();
        System.out.println(p1.title);

        System.out.println("Insert Id");
        p1.id=sc.nextInt();
        sc.nextLine();
        System.out.println(p1.id);

        System.out.println("Insert description");
        p1.description=sc.nextLine();
        System.out.println(p1.description);

        System.out.println("Insert quantity");
        p1.quantity=sc.nextDouble();
        System.out.println(p1.quantity);

        System.out.println("Insert price ");
        p1.price= sc.nextDouble();
        System.out.println(p1.price);
    }
}
