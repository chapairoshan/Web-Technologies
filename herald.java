import java.util.Scanner;
public class herald{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();
        int area = length*breadth;
        System.out.println(area);
    }
}