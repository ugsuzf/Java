import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number (0 is exit):");
            int x = scan.nextInt();
            if (x==0)
                break;
            boolean prime = true;
            for (int i =2;i<=x-1;i++){
                if(x%i==0){
                    prime = false;
                    break;
                }
            }
            if(x<2){
                prime =false;
            }
            System.out.println("Is it prime?");
            System.out.println(prime);
        }
    }
}
