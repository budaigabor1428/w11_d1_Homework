import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(50);
    }

    @Test
    public void hasSheet(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void checksNumberOfSheetsEnough(){
        assertEquals(true, printer.);
    }
}

