package ass1;
import java.util.Scanner;
public class Convert{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Number :");
     int num=sc.nextInt();
     System.out.println("Given Number:"+num);
     System.out.println("Binary:"+Integer.toBinaryString(num));
     System.out.println("Octal:"+Integer.toOctalString(num));
     System.out.println("Hexadecimal:"+Integer.toHexString(num));
 }
}