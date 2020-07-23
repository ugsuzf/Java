import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("First number :");
        int x = scan.nextInt();
        System.out.println("Second number");
        int y = scan.nextInt();
        boolean check=false;
        for (int i=2;i<=x&&i<=y;i++){
            if (x%i==0 && y%i==0){
                check=true;
                break;
                }
            }
        System.out.println(check?"Not relatively prime":"Relatively prime");
        }
}
