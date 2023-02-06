import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurDateTime {
    public static String getCurDate(int opt) {
        String ret = null;
        if (opt == 1) {
            ret = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        }
        else if (opt == 2) {
            ret = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        }
        else if (opt == 3) {
            ret = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        }
        return ret;
    }
    public static String getCurTime(int opt) {
        String ret = null;
        if (opt == 1) {
            ret = LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
        }
        else if (opt == 2) {
            ret = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
        else if (opt == 3) {
            ret = LocalTime.now().format(DateTimeFormatter.ofPattern("HH时mm分ss秒"));
        }
        return ret;
    }
    public static String getCurDateTime(int opt) {
        String ret = null;
        if (opt == 1) {
            ret = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        }
        else if (opt == 2) {
            ret = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        }
        else if (opt == 3) {
            ret = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒"));
        }
        return ret;
    }
}