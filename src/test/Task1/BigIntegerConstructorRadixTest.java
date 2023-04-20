package test.Task1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerConstructorRadixTest{
    @Test
    public void whenValidPositiveValueInSpecifiedRadixAndValidRadix_thenCreatePositiveBigInteger(){
        BigInteger bigInteger = new BigInteger("100023",10);
        assertEquals(new BigInteger("100023"), bigInteger);
    }
    @Test
    public void whenValidNegativeValueInSpecifiedRadixAndValidRadix_thenCreatePositiveBigInteger(){
        BigInteger bigInteger = new BigInteger("-100023",10);
        assertEquals(new BigInteger("-100023"), bigInteger);
    }
    @Test
    public void whenValidValueNotInSpecifiedRadixAndValidRadix_thenException(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
            BigInteger bigInteger = new BigInteger("100023",2);
        });
        assert(exception instanceof NumberFormatException);
    }
    @Test
    public void whenInvalidValuedAndValidRadix_thenException(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
            BigInteger bigInteger = new BigInteger("",2);
        });
        assert(exception instanceof NumberFormatException);
    }
    @Test
    public void whenValidValueAndRadixOverMax_thenException(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
            BigInteger bigInteger = new BigInteger("100023",37);
        });
        assert(exception instanceof NumberFormatException);
    }
    @Test
    public void whenValidValueAndRadixUnderMin_thenException(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
            BigInteger bigInteger = new BigInteger("101010",1);
        });
        assert(exception instanceof NumberFormatException);
    }
}
