// given an array elements count number of equilibrium index 
// and an index is said to be equilibrium if sum of all elements left of the ith index is equals
//  to sum of all elements of ith index.

// NOTE:
// if i == 0 then left sum is 0
// if i == n -1 then right sum is 0.
// DO THIS CODE IN JAVA 
// arr = [ -3, 2, 5, 1]
// alogorithm:
// create a prefix sum array and store cumulative sum of array elements in it.
// initialise the count = 0
// calculate the left sum and right sum for each index and compare them


public class Equilibrium {
    public static int findEquilibrium(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefixSum[i - 1];
            int rightSum = (i == n-1) ? 0 : prefixSum[n - 1] - prefixSum[i];
            if (leftSum == rightSum)
                count++;
        }
        return count;
    }
}