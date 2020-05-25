import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasNumberOfSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void  hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void setSheets(){
        printer.setSheets(109);
        assertEquals(109, printer.getSheets());
    }

    @Test
    public void setToner(){
        printer.setToner(107);
        assertEquals(107, printer.getToner());
    }

    @Test
    public void ifIPrintThePaperAndTonerGoesDown(){
        printer.print(10, 5);
        assertEquals(50, printer.getSheets());
        assertEquals(50, printer.getToner());
    }

    @Test

    public void thereIsEnoughPaper(){
        assertEquals(true, printer.ifEnoughPaper(30));
    }

    @Test

    public void thereIsNotEnoughPaper(){
        assertEquals(false, printer.ifEnoughPaper(200));
    }



}


//
//       The print method will only run if the printer has enough paper:
//        If it runs it will reduce the value of the paper left
//        by number of copies * number of pages.
//
//