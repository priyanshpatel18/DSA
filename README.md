# Data Structures & Algorithms

In this document, I have recorded each problem I've solved while practicing Data Structures and Algorithms, along with detailed solutions and approaches.

## Problem List

| Problem Name       | Solution File | Problem Links | Approach |
|--------------------|---------------|---------------|----------|
| Reverse an Array    | [Solution1.java](./Solution1.java) | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/reverse-an-array/1) | [Iterative](#reverse-an-array) |
| Kth Smallest    | [Solution2.java](./Solution2.java) | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1) | [Recursive](#kth-smallest-element) |
| Max n Min of Array    | [Solution3.java](./Solution3.java) | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1) | [Iterative](#maximum-and-minimum-of-an-array) |
| Counting Sort    | [Solution4.java](./Solution4.java) | [GeeksforGeeks](https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1) | [Iterative](#counting-sort) |

### Reverse an Array
The approach for reversing an array is as follows:
1. Initialize `start = 0` and `end = arr.length - 1`.
2. Swap `arr[start]` and `arr[end]`.
3. Increment `start` and decrement `end`.
4. Repeat steps 2 and 3 until `start < end`.
5. Return the reversed array.

### Kth Smallest Element
The approach to find kth smallest element in an array is as follows:
1. Initialize `start = 0` and `end = arr.length - 1`.
2. Select a pivot element
3. Partition the array around the pivot element
4. If pivot is at `kth` position, return it
5. If k-th smallest is on the `left` side, `recurse left`
5. If k-th smallest is on the `right` side, `recurse right`
6. Return `arr[k-1]`

### Maximum and Minimum of an array
1. Initialize `min = MAX_VALUE` and `max = MIN_VALUE`
2. Iterate through the array
3. If arr[i] < min, then min = arr[i]
4. If arr[i] > max, then max = arr[i]
5. Return max and min

### Counting Sort 
1. Count the number of 0s, 1s, and 2s in the array
2. Replace the first count0 elements with `0`
3. Replace the next count1 elements with `1`
4. Replace the next count2 elements with `2`

- If elements of an array are known to be in a range, then we can use Counting Sort