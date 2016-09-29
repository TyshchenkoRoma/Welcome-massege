package welcome;

import org.junit.Test;
import welcome.Message;

import static org.junit.Assert.*;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by roman on 28.09.16.
 */
public class MessageTest {
    Message message = new Message();
    @Test
    public void testDay() {
    String testMessage =   message.getMessage(10, ResourceBundle.getBundle(
                "Message", Locale.forLanguageTag("en")));
        String expected = "Good day, World!";
        assertEquals(expected, testMessage);
    }
}
