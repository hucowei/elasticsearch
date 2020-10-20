package com.zjh.web.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    /**
     * 中文日期描述
     */
    private static String chinesePatterDate="yyyy年MM月dd日";

    /**
     * 中文日期加时间描述
     */
    private static String chinesePatterDateTime="yyyy年MM月dd日HH时mm分ss秒";

    /**
     * 符号日期描述
     */
    private static String symbolPatterDate="yyyy-MM-dd";

    /**
     * 符号日期时间描述
     */
    private static String symbolPatterDateTime="yyyy-MM-dd HH:mm:ss";



    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld.toString());
        String strLd = ld.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        System.out.println(strLd);
        LocalTime lt = LocalTime.now();
        System.out.println(lt.toString());
        String strLt = lt.format(DateTimeFormatter.ofPattern("HH时mm分ss秒"));
        System.out.println(strLt);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.toString());
        String strLdt = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(strLdt);
    }


}
