import java.util.Scanner;
class s1p8 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2==0)
            System.out.print(i + " ");
        }
    }
}
