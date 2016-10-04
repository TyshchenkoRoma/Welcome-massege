package junit.def_message;

import org.junit.Test;
import welcome.Message;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

/**
 * Created by roman on 29.09.16.
 */
public class EveningTestDef {
    Message message = new Message();
    @Test
    public void testDay() {
        String testMessage =   message.getMessage(19, ResourceBundle.getBundle(
                "Message", Locale.getDefault()));
        String expected = "Good evening, World!";
        assertEquals(expected, testMessage);
    }
}
