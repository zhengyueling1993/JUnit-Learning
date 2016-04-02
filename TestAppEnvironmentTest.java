/**
 * Created by yuelingzheng on 16/4/1.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL","Http;//192.168.0.1",TestAppEnv.getUrl());
    }
    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain","192.168.0.1",TestAppEnv.getUrl());
        assertEquals("Just the port","67",TestAppEnv.PORT);
    }
    @Test
    public void ifElseNestAddHttp(){
        String url = "t66y.com";
        if (url.startsWith("http")){
        }
        else {
            if (!url.startsWith("www")){
                url = "www" + url;
            }
            assertTrue(url.startsWith("http://"));
            assertEquals("t66y.com",url);
        }
    }

}
