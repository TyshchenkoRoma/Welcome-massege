package $CIRCLE_TEST_REPORTS.mesTests.ru_message;

import org.junit.Test;
import welcome.Message;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

/**
 * Created by roman on 29.09.16.
 */
public class MorningTestRu {
    Message message = new Message();
    @Test
    public void testDay() {
        String testMessage =   message.getMessage(6, ResourceBundle.getBundle(
                "Message", Locale.forLanguageTag("ru")));
        String expected = "Ð\u0094Ð¾Ð±Ñ\u0080Ð¾Ðµ Ñ\u0083Ñ\u0082Ñ\u0080Ð¾, Ð\u009CÐ¸Ñ\u0080!";
        assertEquals(expected, testMessage);
    }
}
