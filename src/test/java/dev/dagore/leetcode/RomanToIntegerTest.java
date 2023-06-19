package dev.dagore.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {
  RomanToInteger romanToInteger = new RomanToInteger();
  
  @Test
  public void IIIEqualsToThree() {
    assertEquals("III", 3, romanToInteger.romanToInt("III"));
  }
  
  @Test
  public void LVIIIEqualsToFiftyEight(){
    assertEquals("LVIII", 58, romanToInteger.romanToInt("LVIII"));
  }
  
  @Test
  public void MCMXCIVEqualsToOneThousandNineHundredNinetyFour() {
    assertEquals("MCMXCIV", 1994, romanToInteger.romanToInt("MCMXCIV"));
  }
}
