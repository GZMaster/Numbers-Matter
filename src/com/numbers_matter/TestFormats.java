package com.numbers_matter;

import java.util.Calendar;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.Math.*;

public class TestFormats {

    public static void main(String[] args){

        int one = 20456654;
        double two = 100567890.248907;
        Date today = new Date();

        String s = String.format("The rank is %,d out of %,.2f", one, two);
        String d = String.format("%tA, %<tB %<td", today);

        System.out.println(s);
        System.out.println(d);

        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 15, 40);
        long day1 = c.getTimeInMillis();
        day1 += 100 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("add 35 days " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("roll 35 days " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("set to 1 " + c.getTime());

        out.println("sqrt " + sqrt(2.0));
        out.println("tan " + tan(60));

    }

}
