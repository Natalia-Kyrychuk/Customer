

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCustomer
{
    @Test
    public void testGering()
    {
        Customer c;
        c = new Customer("Max Mustermann", 1000);
        //Fehler
        assertEquals(1000, c.getGeld());
    }
}
    @Test
    public void testGering()
    {
        Customer c;
        c = new Customer("Max Mustermann", 1000);
        //Fehler
        assertEquals(1000, c.getGeld());
    }

        