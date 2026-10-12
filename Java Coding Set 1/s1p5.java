import java.util.Scanner;
class s1p5 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}
