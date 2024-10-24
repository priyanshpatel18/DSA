// kth smallest element

public class Solution2 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 4, 6, 7, 9, 8 };
    System.out.println(kthSmallest(arr, 4));
  }

  public static int kthSmallest(int[] arr, int k) {
    if (arr.length == 0 || k > arr.length || k <= 0) {
      return -1;
    }
    return quickSelect(arr, 0, arr.length - 1, arr.length - k);
  }

  public static void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int pivot = partition(arr, start, end);
      quickSort(arr, start, pivot - 1);
      quickSort(arr, pivot + 1, end);
    }
  }

  public static int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int i = start - 1;
    for (int j = start; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, end);
    return i + 1;
  }

  public static void swap(int[] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }

  public static int quickSelect(int[] arr, int start, int end, int k) {
    if (start == end) {
      return arr[start];
    }

    int pivotIndex = partition(arr, start, end);

    // If pivot is at k-th position, return it
    if (pivotIndex == k) {
      return arr[pivotIndex];
    }
    // If k-th smallest is on the left side, recurse left
    else if (pivotIndex > k) {
      return quickSelect(arr, start, pivotIndex - 1, k);
    }
    // If k-th smallest is on the right side, recurse right
    else {
      return quickSelect(arr, pivotIndex + 1, end, k);
    }
  }
}

// Approach 1 (nlog(n))
// 1. Initialize start = 0 and end = arr.length - 1
// 2. Sort the array using quick sort
// 3. Return arr[k - 1]

// Approach 2 (n)
// 1. Initialize start = 0 and end = arr.length - 1
// 2. Select a pivot element
// 3. Partition the array around the pivot element
// 4. If pivot is at k-th position, return it
// 5. If k-th smallest is on the left side, recurse left
// 6. If k-th smallest is on the right side, recurse right
// 7. Return arr[k - 1]