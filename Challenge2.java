/**
 * Daily Coding Problem: Problem #2
 *
 * Good morning! Here's your coding interview problem for today.
 *
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of
 * the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */

public class Challenge2 {
  public static void product(int[] arr) {
    int size = arr.length;
    int left[] = new int[size];
    int right[] = new int[size];

    left[0] = right[size - 1] = 1;

    for (int i = 1, j = size-2; i < size; i++, j--) {
      left[i] = arr[i - 1] * left[i - 1];
      right[j] = arr[j + 1] * right[j + 1];
    }

    for (int i = 0; i < size; i++)
      System.out.printf("%d ", left[i] * right[i]);

    System.out.println();
  }

  public static void main(String[] args) {
    product(new int[]{3, 2, 1});
  }
}
