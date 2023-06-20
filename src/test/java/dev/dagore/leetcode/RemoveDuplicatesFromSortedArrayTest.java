package dev.dagore.leetcode;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
  private static RemoveDuplicatesFromSortedArray instance = new RemoveDuplicatesFromSortedArray();

  @Test
  public void exampleOne() {
    int[] numbers = { 1, 1, 2 };
    int[] expectedNumbers = { 1, 2 };

    int k = instance.removeDuplicates(numbers);

    assert k == expectedNumbers.length;
    for (int i = 0; i < k; i++) {
      assert numbers[i] == expectedNumbers[i];
    }
  }

  @Test
  public void exampleTwo() {
    int[] numbers = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    int[] expectedNumbers = { 0, 1, 2, 3, 4 };

    int k = instance.removeDuplicates(numbers);

    assert k == expectedNumbers.length;
    for (int i = 0; i < k; i++) {
      assert numbers[i] == expectedNumbers[i];
    }
  }
}
