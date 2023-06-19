package dev.dagore.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidPalindromeTest {
  ValidPalindrome validPalindrome = new ValidPalindrome();

  @Test
  public void baseTrueCase() {
    String input = "Sara Baras";
    assertEquals(input, true, validPalindrome.isPalindrome(input));
  }

  @Test
  public void baseFalseCase() {
    String input = "race a car";
    assertEquals(input, false, validPalindrome.isPalindrome(input));
  }

  @Test
  public void stringWithNonAlphanumericCharactersCase() {
    String input = "A man, a plan, a canal: Panama";
    assertEquals(input, true, validPalindrome.isPalindrome(input));
  }

  @Test
  public void emptyStringCase() {
    String input = " ";
    assertEquals(input, true, validPalindrome.isPalindrome(input));
  }
}
