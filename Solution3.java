// Find Min and Max
public class Solution3 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 4, 6, 7, 9, 8 };
    Pair<Long, Long> result = getMinMax(arr);
    System.out.println("Min: " + result.getKey());
    System.out.println("Max: " + result.getValue());
  }

  public static Pair<Long, Long> getMinMax(int[] arr) {
    if (arr.length == 0) {
      return new Pair<Long, Long>(0L, 0L);
    }
    if (arr.length == 1) {
      return new Pair<Long, Long>(Long.valueOf(arr[0]), Long.valueOf(arr[0]));
    }

    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return new Pair<Long, Long>(min, max);
  }
}

class Pair<K, V> {
  private final K key;
  private final V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}

// Approach
// 1. Initialize min = Long.MAX_VALUE and max = Long.MIN_VALUE
// 2. Iterate through the array
// 3. If arr[i] < min, then min = arr[i]
// 4. If arr[i] > max, then max = arr[i]
// 5. Return new Pair<Long, Long