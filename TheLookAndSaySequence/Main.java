import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a=1;
        while (a>0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number(0 is exit):");
            int x = scan.nextInt();
            if (x==0) {
                System.out.println("Thank you and see you again :))");
                break;
            }
            String newvalue = Integer.toString(x);
            String number = newvalue;
            System.out.println("Enter the how many times will turn");
            int y = scan.nextInt();

            for (int i = 1; i <= y; i++) {
                System.out.println(number);
                number = lookandsay(number);
            }
        }
    }
    public static String lookandsay(String number){
        StringBuilder result= new StringBuilder();

        char tmp= number.charAt(0);
        number= number.substring(1) + " ";
        int times= 1;

        for(char digit: number.toCharArray()){
            if(digit != tmp){
                result.append(times + "" + tmp);
                times= 1;
                tmp= digit;
            }else{
                times+= 1;
            }
        }
        return result.toString();
    }
}
