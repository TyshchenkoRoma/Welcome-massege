package welcome.ru_message;

import org.junit.Test;
import welcome.Message;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

/**
 * Created by roman on 29.09.16.
 */
public class DayTestRu {
    Message message = new Message();
    @Test
    public void testDay() {
        String testMessage =   message.getMessage(10, ResourceBundle.getBundle(
                "Message", Locale.forLanguageTag("ru")));
        String expected = "Ð\u0094Ð¾Ð±Ñ\u0080Ð¾Ðµ Ð´ÐµÐ½Ñ\u008C, Ð\u009CÐ¸Ñ\u0080!";
        assertEquals(expected, testMessage);
    }
}
