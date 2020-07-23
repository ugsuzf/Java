public class Main {

    public static void main(String[] args) {
	
        System.out.println("Enter a number :");
	    Scanner scan = new Scanner(System.in);
        int x =scan.nextInt();
        String y = Integer.toString(x);

        for (int i=y.length()-1,f=1; i>=0;i--,f++){
            int a1 = (int) Math.pow(10,i);
            int a= x/a1;
            x=x -(a*a1);
            System.out.println(f+". digit => "+a);
        }
    }
}
