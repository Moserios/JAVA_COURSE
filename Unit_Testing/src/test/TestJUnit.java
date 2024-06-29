package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJUnit {
    String message = "Hello IT World!";
    MessagePrinter messagePrinter = new MessagePrinter(message);

    @Test
    public void testMessagePrinterEqual(){

        assertEquals(message, messagePrinter.printMessage());
    }

    @Test
    public void testMessagePrinterNotEqual(){

        assertNotEquals(message + "!", messagePrinter.printMessage());
    }

    @Test
    public void testStringsAreEqual(){
        String str1 = "String";
        String str2 = "String";
        assertEquals(str1,str2);
    }

    @Test
    public void testEquasionIsTrue(){
        int a = 1;
        int b = 2;
        assertTrue(a < b);
        assertFalse(a > b);
        assertTrue(b > a);
    }

    @Test
    public void testValueIsNull(){
        String str1 = null;
        assertNull(str1);
    }

    @Test
    public void testReferenceToTheSameObject(){
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        assertSame(str1,str2);
        assertNotSame(str2,str3);
    }

    @Test
    public void testArreysAreEqual(){
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(arr1, arr2);
    }
}
