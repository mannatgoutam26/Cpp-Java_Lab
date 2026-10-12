import java.util.Scanner;
class s1p4 {
    public static void main(String[] args) {
        int a;
        int sum=0;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        for(int i=1;i<=a;i++){
            sum += i;
        }
        System.out.print(sum);

    }
}
