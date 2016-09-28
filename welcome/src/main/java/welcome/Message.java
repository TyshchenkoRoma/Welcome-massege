package welcome;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by roman on 27.09.16.
 */
public class Message {
    {
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/resources/log4j.properties");
    }
    private static final Logger logger = Logger.getLogger(Message.class);
    private String textMessage;

    public static void main(String[] args) {
        Message message = new Message();

        double time = getTime();

        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                "Message", Locale.forLanguageTag("en"));

        String result = message.getMessage(time, resourceBundle);
        logger.info("Output result.");
        System.out.println(result);
    }

    public  String getMessage(double time, ResourceBundle resourceBundle) {
        logger.info("Get information message.");
        if (time >= 6 && time < 9) {
            textMessage= resourceBundle.getString("s1");
        }
        if (time >= 9 && time < 19) {
            textMessage= resourceBundle.getString("s2");
        }
        if (time >= 19 && time < 23) {
            textMessage= resourceBundle.getString("s3");
        }
        if (time >= 23 || time < 6) {
            textMessage= resourceBundle.getString("s4");
        }
        return textMessage;
    }

    private static double getTime() {
        logger.info("Get current time.");
        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("kk");
        return Double.parseDouble(format1.format(date));
    }
}
