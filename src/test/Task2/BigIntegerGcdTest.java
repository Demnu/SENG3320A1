package test.Task2;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerGcdTest {
    @Test
    public void TestCase1() {
        BigInteger _this = new BigInteger("-2");
        BigInteger value = new BigInteger("-3");
        assertEquals(new BigInteger("1"), _this.gcd(value));
    }

    @Test
    public void TestCase2() {
        BigInteger _this = new BigInteger(Integer.MIN_VALUE + "");
        BigInteger value = new BigInteger("0");
        assertEquals(new BigInteger("2147483648"), _this.gcd(value));
    }

    @Test
    public void TestCase3() {
        BigInteger _this = new BigInteger(1, new byte[] { 20, 10, 2, -1 });
        BigInteger value = new BigInteger("1");
        assertEquals(new BigInteger("1"), _this.gcd(value));
    }

    @Test
    public void TestCase4() {
        BigInteger _this = new BigInteger("0");
        BigInteger value = new BigInteger("35");
        assertEquals(new BigInteger("35"), _this.gcd(value));
    }

    @Test
    public void TestCase5() {
        BigInteger _this = new BigInteger(1, new byte[] { 20, 10, 2, -1 });
        BigInteger value = new BigInteger(1, new byte[] { 20, 10, 2, -1 });
        assertEquals(new BigInteger(1, new byte[] { 20, 10, 2, -1 }), _this.gcd(value));
    }

    @Test
    public void TestCase6() {
        BigInteger _this = new BigInteger("64");
        BigInteger value = new BigInteger("32");
        assertEquals(new BigInteger("32"), _this.gcd(value));
    }
}
