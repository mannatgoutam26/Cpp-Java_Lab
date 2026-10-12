import java.util.Scanner;
class s1p10 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter value of a and b : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();

        while(b!=0){
            int x = b;
            b=a%b;
            a = x;

        }
        System.out.println("GCD of two numbers is : " + a);
    }
}
