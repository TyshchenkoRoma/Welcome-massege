package $CIRCLE_TEST_REPORTS.mesTests.ru_message;

import org.junit.Test;
import welcome.Message;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

/**
 * Created by roman on 29.09.16.
 */
public class NidhtTestRu {
    Message message = new Message();
    @Test
    public void testNight() {
        String testMessage =   message.getMessage(4, ResourceBundle.getBundle(
                "Message", Locale.forLanguageTag("ru")));
        String expected = "Ð\u0094Ð¾Ð±Ñ\u0080Ð¾Ð¹ Ð½Ð¾Ñ\u0087Ð¸, Ð\u009CÐ¸Ñ\u0080!";
        assertEquals(expected, testMessage);
    }
}
