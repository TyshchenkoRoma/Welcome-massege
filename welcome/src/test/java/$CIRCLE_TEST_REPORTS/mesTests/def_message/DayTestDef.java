package $CIRCLE_TEST_REPORTS.mesTests.def_message;

import org.junit.Test;
import welcome.Message;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

/**
 * Created by roman on 29.09.16.
 */
public class DayTestDef {
    Message message = new Message();
    @Test
    public void testDay() {
        String testMessage =   message.getMessage(10, ResourceBundle.getBundle(
                "Message", Locale.getDefault()));
        String expected = "Good day, World!";
        assertEquals(expected, testMessage);
    }
}
