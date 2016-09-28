import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by roman on 27.09.16.
 */
public class Message {
    private static final Logger logger = Logger.getLogger("Message");


    public static void main(String[] args) {
        Message message = new Message();

        double time = getTime();

        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                "Message", Locale.forLanguageTag("en"));

        message.getMessage(time, resourceBundle);
    }

    public  void getMessage(double time, ResourceBundle resourceBundle) {
        if (time >= 6 && time < 9) {
            System.out.println(resourceBundle.getString("s1"));
        }
        if (time >= 9 && time < 19) {
            System.out.println(resourceBundle.getString("s2"));
        }
        if (time >= 19 && time < 23) {
            System.out.println(resourceBundle.getString("s3"));
        }
        if (time >= 23 || time < 6) {
            System.out.println(resourceBundle.getString("s4"));
        }
    }

    private static double getTime() {
        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("kk");
        return Double.parseDouble(format1.format(date));
    }
}
