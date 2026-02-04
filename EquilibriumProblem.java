// arr =[ -7 , 1 , 5, 2 , -4 , 3 , 6 ]
// find the right side sum and left side sum equal index
import java.util.Scanner;

public class EquilibriumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        int rightSum = totalSum - arr[0];
        int count = 0;
        if (leftSum == rightSum) {
            count++;
        }
        for (int i = 1; i < n; i++) {
            leftSum += arr[i - 1];
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                count++;
            }
        }
        System.out.println(count);
    }
}