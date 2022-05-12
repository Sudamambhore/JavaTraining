import java.util.*;

class ArraySquareAllNumber {
    public static void main(String[] args) {
        System.out.println("Enter Five Numbers");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sq[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sq[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(sq[i]);
        }
    }
}