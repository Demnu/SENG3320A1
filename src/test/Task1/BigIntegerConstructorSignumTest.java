package test.Task1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerConstructorSignumTest{
    @Test
    public void whenSignumIs1AndMagnitudeIsValid_thenCreatePositiveBigInteger(){
        BigInteger bigInteger = new BigInteger(1, new byte[] {20,10,2,-1});
        assertEquals(new BigInteger("336200447"), bigInteger);
    }

    @Test
    public void whenSignumIs0AndMagnitudeHasOnlyNonZeroBytes_thenCreateBigInteger(){
        BigInteger bigInteger = new BigInteger(0, new byte[] {0,0,0,0,0});
        assertEquals(new BigInteger("0"), bigInteger);
    }
    @Test
    public void whenSignumIsMinus1AndMagnitudeIsValid_thenCreateNegativeBigInteger(){
        BigInteger bigInteger = new BigInteger(-1, new byte[] {20,10,2,-1});
        assertEquals(new BigInteger("-336200447"), bigInteger);
    }
    @Test
    public void whenSignumIs0AndMagnitudeHasOneOrMoreNonZeroBytes_thenException(){        
        Exception exception = assertThrows(RuntimeException.class, () -> {
            BigInteger bigInteger = new BigInteger(0, new byte[] {20,10,2,-1});
        });
        assert(exception instanceof NumberFormatException);
    }
    @Test
    public void whenSignumIsLessThanMinus1AndMagnitudeIsValid_thenException(){        
        Exception exception = assertThrows(RuntimeException.class, () -> {
            BigInteger bigInteger = new BigInteger(-2, new byte[] {20,10,2,-1});
        });
        assert(exception instanceof NumberFormatException);

    }
    @Test
    public void whenSignumIsMoreThan1AndMagnitudeIsValid_thenException(){        
        Exception exception = assertThrows(RuntimeException.class, () -> {
            BigInteger bigInteger = new BigInteger(2, new byte[] {20,10,2,-1});
        });
        assert(exception instanceof NumberFormatException);
    }
}