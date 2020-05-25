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
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void  hasToner(){
        assertEquals(4, printer.getToner());
    }

    @Test
    public void setSheets(){
        printer.setSheets(9);
        assertEquals(9, printer.getSheets());
    }

    @Test
    public void setToner(){
        printer.setToner(7);
        assertEquals(7, printer.getToner());
    }
}


//    Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper.
//        If it runs it will reduce the value of the paper left
//        by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.