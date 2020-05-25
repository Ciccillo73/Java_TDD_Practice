import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }


    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void sub(){
        assertEquals(90, waterBottle.sub());
    }

    @Test
    public void setToEmpty(){
        assertEquals(0, waterBottle.setEmpty());
    }

}
