import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        this.waterBottle = new WaterBottle();
    }


    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void removesFromVolumeEachTime(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void setsVolumeToZero(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void setsVolumeToFull(){
        waterBottle.empty();
        waterBottle.setToFull();
        assertEquals(100, waterBottle.getVolume());
    }

}
