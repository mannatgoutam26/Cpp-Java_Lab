import java.util.Scanner;
class s1p2 {
    public static void main(String[] args) {
        int a;
        int reverse =0;
        int original;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        original = a;
        while(original > 0){
            int remainder = original%10;

            reverse = reverse*10 + remainder;
            original /=10;

        }
        System.out.print(reverse);

    }
}
