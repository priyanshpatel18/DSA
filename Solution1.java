// Reverse an array

public class Solution1 {
  public static void main(String[] args) {
    int[] arr = { 1 };
    reverseArray(arr);
  }

  public static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      swap(arr, start, arr.length - 1 - start);
      start++;
      end--;
    }
  }

  public static void swap(int[] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}

// Approach
// 1. Initialize start = 0 and end = arr.length - 1
// 2. Swap arr[start] and arr[end]
// 3. Increment start and decrement end
// 4. Repeat step 2 and 3 until start < end / 2
// 5. Return arr