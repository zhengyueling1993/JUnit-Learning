/**
 * Created by yuelingzheng on 16/4/1.
 */
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.matchers.JUnitMatchers.hasItem;


public class testWithHamcrest {
    private ArrayList<String>  values;
    @Before
    public void setUpList(){
        values = new ArrayList<String>();
        values.add("x");
        values.add("y");
        values.add("z");
    }
    @Test
    public void testWithHamcrest(){
        assertThat(values, hasItem(anyOf(equalTo("one"), equalTo("two"),
                equalTo("three"))));
    }
}
