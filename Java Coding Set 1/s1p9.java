import java.util.Scanner;
class s1p9 {
    public static void main(String[] args) {
        int a;
        int fact = 1 ;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        for(int i=1;i<=a;i++){
            fact = fact*i;

        }
        System.out.print(fact);

    }
}
