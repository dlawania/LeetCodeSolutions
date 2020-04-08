import java.util.Scanner;
class HappyNumber {
    public static boolean isHappy(int n) {
        
        int sum=0;
        while(n>9){
            sum = sum + (n%10)*(n%10);
            n=n/10;
        }
        if(sum == 1)
            return true;
        
        return (isHappy(sum));

    }

    public static void main(final String[] args) {
        final Scanner br = new Scanner(System.in);

        System.out.println("Enter a number to test of it is a Happy Number: ");
        final int n = Integer.valueOf(br.nextLine());

        final boolean b = isHappy(n);

        System.out.println(n+" is a Happy Number: "+b);
    }
}
