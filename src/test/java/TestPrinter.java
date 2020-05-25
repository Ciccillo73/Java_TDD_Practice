import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 4);
    }

    @Test
    public void hasNumberOfSheets(){
        assertEquals(100, printer.getSheetsLeft());
    }

    @Test
    public void  hasToner(){
        assertEquals(4, printer.getToner());
    }

    @Test
    public void setSheetsLeft(){
        printer.setSheetsLeft(9);
        assertEquals(9, printer.getToner());
    }
}
