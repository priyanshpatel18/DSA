// Sort an array without using Sorting Algorithm

public class Solution4 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 0, 0, 1, 1, 2, 1, 2 };
    sort012(arr);
  }

  public static void sort012(int[] arr) {
    int count0 = 0, count1 = 0, count2 = 0;

    for (int num : arr) {
      if (num == 0) count0++;
      else if (num == 1) count1++;
      else if (num == 2) count2++;
    }

    int i = 0;
    while(count0-- > 0) arr[i++] = 0;
    while(count1-- > 0) arr[i++] = 1;
    while(count2-- > 0) arr[i++] = 2;
  }
}

// Approach
// 1. Count the number of 0s, 1s, and 2s in the array
// 2. Replace the first count0 elements with 0
// 3. Replace the next count1 elements with 1
// 4. Replace the next count2 elements with 2

// Time Complexity: O(n)
// If elements of an array are known to be in a range, then we can use counting sort.