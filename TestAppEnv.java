/**
 * Created by yuelingzheng on 16/4/1.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.168.0,1";
    public static final String PORT = "67";

    public static String getUrl(){
        return "http://" + DOMAIN + ":" + PORT;
    }
}
