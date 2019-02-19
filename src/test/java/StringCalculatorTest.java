
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
	
 @Before
  public void setup(){
  }
	
//test ensemble vide
 @Test
  public void testAddEmpty() {
    // Arrange
	long expected = 0;
    StringCalculator sc = new StringCalculator("");
    // Act
    long actual = sc.getSum();
    // Assert
    assertThat(actual, is(expected));
}
//test avec une digite
 @Test
  public void testAddone() {
    // Arrange
	long expected = 1;
    StringCalculator sc = new StringCalculator("1");
    // Act
    long actual = sc.getSum();
    // Assert
    assertThat(actual, is(expected));
}
}
