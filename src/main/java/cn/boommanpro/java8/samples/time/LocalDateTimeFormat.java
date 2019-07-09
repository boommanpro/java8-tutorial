package cn.boommanpro.java8.samples.time;

import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author <a href="mailto:wangqimeng@mininglamp.com">wangqiemng</a>
 * @date 2019/7/9 16:20
 * @created by wangqimeng
 */
public class LocalDateTimeFormat {
    private static final DateTimeFormatter DEFAULT_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static String toString(LocalDateTime localDateTime) {
        return localDateTime.format(DEFAULT_DATE_TIME_FORMATTER);
    }

    public static LocalDateTime from(@NotNull String date) {
        return LocalDateTime.parse(date, DEFAULT_DATE_TIME_FORMATTER);
    }
    public static String toString(LocalDate localDate) {
        return localDate.format(DEFAULT_DATE_FORMATTER);
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        // print now.toString()
        System.out.println(now.toString());

        String printFormat = toString(now);
        //toString yyyy-MM-dd HH:mm:ss
        System.out.println(printFormat);

        LocalDateTime from = from(printFormat);

        System.out.println(from);

    }
}
