/**
 * Created by yuelingzheng on 16/4/1.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class catchANullPointerException {
    @Test
    public void catchANullPointerException(){
        Integer age = null;
        String ageAsString;

        try{
            ageAsString = age.toString();
        }
        catch (NullPointerException e){
            age = 10;
            ageAsString = age.toString();
        }
        String yourAge =
                "You are " + age.toString() + "years old";

        assertEquals("Your are 18 years old",yourAge);
    }
}
