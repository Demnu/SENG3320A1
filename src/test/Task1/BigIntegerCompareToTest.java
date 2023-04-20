package test.Task1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerCompareToTest{
    @Test
    public void whenValIsGreaterThanThisBigInteger_thenReturnNegativeOne(){
        BigInteger _this = new BigInteger("2");
        BigInteger value = new BigInteger("10");
        assertEquals(-1,_this.compareTo(value));
    }
    @Test
    public void whenValIsLessThanThisBigInteger_thenReturnPositiveOne(){
        BigInteger _this = new BigInteger("10");
        BigInteger value = new BigInteger("2");
        assertEquals(1,_this.compareTo(value));
    }
    @Test
    public void whenValIsEqualToThisBigInteger_thenReturnZero(){
        BigInteger _this = new BigInteger("2");
        BigInteger value = new BigInteger("2");
        assertEquals(0,_this.compareTo(value));
    }
}