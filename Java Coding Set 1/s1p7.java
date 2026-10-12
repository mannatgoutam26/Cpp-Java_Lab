import java.util.Scanner;
class s1p7 {
    public static void main(String[] args) {
        int a;
        int sum =0;
        int original;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        original = a;
        while(original > 0){
            int remainder = original%10;

            sum += remainder;
            original /=10;

        }
        System.out.print(sum);

    }
}
