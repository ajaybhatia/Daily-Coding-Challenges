/**
* Daily Coding Problem: Problem #1
*
* Good morning! Here's your coding interview problem for today.
*
* This problem was recently asked by Google.
*
* Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
*
* For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*
* Bonus: Can you do this in one pass?
*
*/

import java.util.HashSet;

public class Challenge1 {
  public static void findPair(int[] array, int sum) {
    HashSet<Integer> hashSet = new HashSet<Integer>();

    for (int element : array) {
      int temp = sum - element;
      if (temp >= 0 && hashSet.contains(temp)) {
        System.out.printf("Pair with given sum %d is (%d, %d)\n", sum, element, temp);
        return;
      }

      hashSet.add(element);
    }

    // Not found
    System.out.println("Pair with given sum " + sum + " not found");
  }

  public static void main(String[] args) {
    int[] a = {45, -89, 23, 56, 2, 34, 56};
    int n = 21;

    findPair(a, n);
  }
}
