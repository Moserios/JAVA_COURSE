package test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestServer {
    private Calculator calculator;
    private static Server server;

    @Test
    public void testAddition(){
        double a = 10;
        double b = 12.5;
        double result = calculator.add(a, b);
        assertEquals(result, 22.5);
        System.out.println("Addition: " + a + " + " + b + " = " + result);
    }

    @Test
    public void testSubstraction(){
        double a = 10;
        double b = 12.5;
        double result = calculator.substract(a, b);
        assertEquals(result, -2.5);
        System.out.println("Substraction: " + a + " - " + b + " = " + result);
    }

    @Test
    public void testMultiplication(){
        double a = 10;
        double b = 12.5;
        double result = calculator.multiply(10, 12.5);
        assertEquals(result, 125.0);
        System.out.println("Multiplication: " + a + " * " + b + " = " + result);
    }

    @Test
    public void testDivision(){
        double b = 10;
        double a = 12.5;
        double result = calculator.divide(a, b);
        assertEquals(result, 1.25);
        System.out.println("Division: " + a + " / " + b + " = " + result);
    }

    @Test()
    public void testDivisionByZero(){
        double b = 0;
        double a = 10;
        assertThrows(ArithmeticException.class, () -> {
            double result = calculator.divide(a, b);
        });
        System.out.println("Division: " + a + " / " + b + " = " + "Zero division Exception");
    }

    @AfterEach
    public void tearDown(){
        calculator = null;
    }

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @BeforeAll
    public static void setUpClass(){
        server = new Server();
        server.connect();
    }

    @AfterAll
    public static void tierDownClass(){
        server.disconnect();
        server = null;
    }

}
