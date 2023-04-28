package test.Task2;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerCompareToTest {

    @Test
    public void TestCase1() {
        BigInteger _this = new BigInteger("-2");
        BigInteger value = new BigInteger("-3");
        assertEquals(1, _this.compareTo(value));
    }

    @Test
    public void TestCase2() {
        BigInteger _this = new BigInteger(1, new byte[] { 20, 10, 2, -1 });
        BigInteger value = new BigInteger(1, new byte[] { 20, 10, 2, 1 });
        assertEquals(1, _this.compareTo(value));
    }

    @Test
    public void TestCase3() {
        BigInteger _this = new BigInteger("-2");
        BigInteger value = new BigInteger("3");
        assertEquals(-1, _this.compareTo(value));
    }

    @Test
    public void TestCase4() {
        BigInteger _this = new BigInteger("-2");
        BigInteger value = new BigInteger(-1, new byte[] { 20, 10, 2, -1 });
        assertEquals(1, _this.compareTo(value));
    }
}