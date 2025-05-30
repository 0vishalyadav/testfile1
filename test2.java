import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        // Write a program to find maximum between three numbers
        Scanner input= new Scanner(System.in);
        System.out.print("enter a number:");
        int num1=input.nextInt();
System.out.println("enter a second nuber :");
int num2=input.nextInt();
System.out.println("entera third number3 :");
int num3=input.nextInt();
if(num1>num3 && num1>num2){
System.out.println("test 1 pass");
}

if(num2>num3 && num2>num1){
System.out.println("test 2 pass");
}
else{
    System.out.println("test 3 pass");
}
    }
}
