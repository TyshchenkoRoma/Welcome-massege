import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created by roman on 27.09.16.
 */
public class Message {
    private static final Logger logger = Logger.getLogger("Message");


    public static void main (String[] args) {

        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("kk");
        double time = Double.parseDouble(format1.format(date));

        if ( time >= 6 && time < 9 ) {
            System.out.println("Good morning, World!");
        }
        if ( time >= 9 && time < 19 ) {
            System.out.println("Good day, World!");
        }
        if ( time >= 19 && time < 23 ) {
            System.out.println("Good evening, World!");
        }
        if ( time >= 23 || time < 6 ) {
            System.out.println("Good night, World! ");
        }
        System.out.println(time);

    }
}
