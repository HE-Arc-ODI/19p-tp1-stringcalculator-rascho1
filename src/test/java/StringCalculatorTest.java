
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raphael.schoeni
 */
public class StringCalculatorTest {
	
	private StringCalculator sc;
	private int sum;
	
 @Before
  public void setup(){
  }
	
	
 @Test
  public void testAddEmpty(String numbers) {
    // Arrange
    StringCalculator sc = new StringCalculator("");
    long expected = 0;
    // Act
    long actual = sc.getSum();
    // Assert
    assertThat(actual, is(expected));
}
}
