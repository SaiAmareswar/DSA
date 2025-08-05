import java.util.Scanner;

public class Input{
    public static void main(String[] a){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=scanner.nextInt();
        System.out.print("Input number is : "+number);
        scanner.close();
    }
}