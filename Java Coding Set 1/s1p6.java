import java.util.Scanner;
class s1p6 {
    public static void main(String[] args) {
        int a;
        int count = 0;
        System.out.print("Enter value of a : ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        for(int i=1;i<=a;i++){
            int remainder = a%i;
            if(remainder == 0)
                count ++;
        }
        if(count==2)
        System.out.print(a + " is a prime number");

        else
        System.out.print("not a prime number");

    }
}
