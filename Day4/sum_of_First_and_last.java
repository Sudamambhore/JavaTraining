import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        int r, n, rev = 0, fd,s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = sc.nextInt();

        int a = n % 10;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        fd = rev % 10;
        s = fd + a;

        System.out.println("Sum of first and last digits:" + s);

    }
}