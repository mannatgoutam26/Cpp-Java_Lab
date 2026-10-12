import java.util.Scanner;
class s1p3 {
    public static void main(String[] args) {
        int a;
        int n1 = 0;
        int n2 = 1;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();

        for(int i=1;i<=a;i++){
            System.out.print(n1 + " ") ;

            int sum = n1+n2;
            n1=n2;
            n2= sum;

        }

    }
}
