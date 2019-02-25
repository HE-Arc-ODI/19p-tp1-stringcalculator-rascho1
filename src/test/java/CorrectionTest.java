import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CorrectionTest {

  //Requirement 1.1
  @Test
  public void whenStringIsEmptyThenZero() {
    Assert.assertEquals("When the string is empty then zero is returned", 0, new StringCalculator("").getSum());
  }

  // Requirement 1.2
  @Test
  public void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
    Assert.assertEquals("When a single number is used, the value returned is the number himself",4, new StringCalculator("4").getSum());
  }

  // Requirement 1.3
  @Test
  public void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
    Assert.assertEquals("When two number are used, the value returned is their sum", 7, new StringCalculator("3,4").getSum());
  }

  // Requirement 2
  @Test
  public void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
    Assert.assertEquals("When multiple numbers are used, the value returned is their sum", 3+6+15+18+46+33, new StringCalculator("3,6,15,18,46,33").getSum());
  }

  // Requirement 3
  @Test
  public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
    Assert.assertEquals("When a new line is used between numbers, the value returned is their sum", 3+7+8, new StringCalculator("3,7\n8").getSum());
  }

  // Requirement 4
  @Test
  public void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
    Assert.assertEquals("When a delimiter is specified, it is used to separate the numbers," +
        "the value returned is their sum",9+5+2, new StringCalculator("//;\n9;5;2").getSum());
  }

  // Requirement 5
  @Test(expected = RuntimeException.class)
  public void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
    new StringCalculator("9,3,-2,3").getSum();
  }

  @Test
  public void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
    RuntimeException exception = null;
    try {
      new StringCalculator("3,4,-2,3,-5,2,-1").getSum();
    } catch (RuntimeException e) {
      exception = e;
    }
    Assert.assertEquals("When a negative number (or more) are used, an exception is thrown containing " +
        "all the negative numbers", "Negative not allowed: [-2, -5, -1]", exception.getMessage());
  }

  // Requirement 6
  @Test
  public void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
    Assert.assertEquals("When one or more number are greater than 1000, they are not included" +
        "in the sum", 1003, new StringCalculator("1000,1,1001,2,1203").getSum());
  }

  // Requirement 7
  @Test
  public void whenDelimiterIsGreaterThan1CharacterThenItIsUsedToSeparateNumbers() {
    Assert.assertEquals("When a delimiter is greater than one character, then it is use to separate numbers",
        7, new StringCalculator("//[¢¢¢]\n3¢¢¢4").getSum());
  }

  // Requirement 8
  @Test
  public void whenMultipleDelimitersAreUsedThenTheyAreUsedToSeparateNumbers() {
    Assert.assertEquals("When multiple delimiters are used, then they are used to separate the numbers",
        10, new StringCalculator("//[=][:][,]\n1,3=2:4").getSum());
  }

  // Requirement 9
  @Test
  public void whenMultipleDelimitersOfMultipleCharactersAreUsedThenTheyAreUsedToSeparateNumbers() {
    Assert.assertEquals("When multiple delimiters of multiple characters are used, then they are used to separate the numbers",
        10, new StringCalculator("//[;;;;][::::][,,,,]\n1;;;;3,,,,2::::4").getSum());
  }
}
