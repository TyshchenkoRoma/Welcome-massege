package welcome.en_message;

import org.junit.Test;
import welcome.Message;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

/**
 * Created by roman on 29.09.16.
 */
public class DayTest {
    Message message = new Message();
    @Test
    public void testDay() {
        String testMessage =   message.getMessage(10, ResourceBundle.getBundle(
                "Message", Locale.forLanguageTag("en")));
        String expected = "Good day, World!";
        assertEquals(expected, testMessage);
    }
}
