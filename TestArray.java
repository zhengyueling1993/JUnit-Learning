/**
 * Created by yuelingzheng on 16/4/1.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestArray {
    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero","one","two","three"};

        for (String numberText:numbers0123){
            System.out.println(numberText);
        }
        assertEquals("zero",numbers0123[0]);
        assertEquals("three",numbers0123[3]);
    }
}
