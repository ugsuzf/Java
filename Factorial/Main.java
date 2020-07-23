import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
            System.out.println("Enter a number (0 is exit):");
            Scanner scan =new Scanner(System.in);
            int num = scan.nextInt();
            if (num==0){
                System.out.println("Thank you :))");
                break;
            }
            long factorial = multiplyNumbers(num);
            System.out.println("Factorial of " + num + " = " + factorial);
        }
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
