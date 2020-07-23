import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String hebele=scan.next();
        if (isNumber(hebele)){
            System.out.println("Integer");
        }
        else{
            System.out.println("String");
        }
    }
    static boolean isNumber(String a){

        for(int i =0;i<a.length();i++){
            if (Character.isDigit(a.charAt(i))==false){
                return false;
            }
        }
        return true;
    }
}
