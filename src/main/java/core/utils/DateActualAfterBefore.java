package core.utils;

import java.util.Calendar;
import java.util.Date;

public class DateActualAfterBefore {

    public Calendar obtainDate(String textDate) {
        int sizeArray = getSizeArray(textDate);
        if (sizeArray == 1) {
            return getTodayYesterdayTomorrow(textDate);
        }
        if (sizeArray == 3) {
            return getDmYsMhAgo(textDate);
        }
        if (sizeArray == 4) {
            return getDmYsMhFuture(textDate);
        }
        return null;
    }

    public Calendar getDmYsMhFuture(String textDate) {
        Date actualDate = new Date();
        String[] arrayTextDate = textDate.split(" ");
        if (arrayTextDate[1].equals("days")  || arrayTextDate[1].equals("day")) {
            return addsSubsDays(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("months") || arrayTextDate[1].equals("month")) {
            return addsSubsMonths(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("years") || arrayTextDate[1].equals("year")) {
            return addsSubsYears(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("seconds")  || arrayTextDate[1].equals("second")) {
            return addsSubsSeconds(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("minutes") || arrayTextDate[1].equals("minute")) {
            return addsSubsMinutes(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("hours") || arrayTextDate[1].equals("hour")) {
            return addsSubsHours(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        return null;
    }

    public Calendar getDmYsMhAgo(String textDate) {
        Date actualDate = new Date();
        String[] arrayTextDate = textDate.split(" ");
        if (arrayTextDate[1].equals("days")  || arrayTextDate[1].equals("day")) {
            return addsSubsDays(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("months") || arrayTextDate[1].equals("month")) {
            return addsSubsMonths(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("years") || arrayTextDate[1].equals("year")) {
            return addsSubsYears(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("seconds")  || arrayTextDate[1].equals("second")) {
            return addsSubsSeconds(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("minutes") || arrayTextDate[1].equals("minute")) {
            return addsSubsMinutes(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("hours") || arrayTextDate[1].equals("hour")) {
            return addsSubsHours(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        return null;
    }

    public Calendar getTodayYesterdayTomorrow(String textDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        Date actualDate = new Date();
        String[] arrayType = textDate.split("/");
        if (textDate == "today") {
            return calendar;
        }
        if (textDate == "tomorrow") {
            return addsSubsDays(actualDate, 1);
        }
        if (textDate == "yesterday") {
            return addsSubsDays(actualDate, -1);
        }
        if (arrayType.length == 3) {
            return convertStringToDate("7/14/2021");
        }
        return null;
    }

    public int getSizeArray(String textDate) {
        String[] arrayType = textDate.split(" ");
        return arrayType.length;
    }

    public Calendar addsSubsDays(Date actualDate, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar;
    }

    public Calendar addsSubsMonths(Date actualDate, int months) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, months + 1);
        return calendar;
    }

    public Calendar addsSubsYears(Date actualDate, int years) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, years);
        return calendar;
    }

    public Calendar addsSubsSeconds(Date actualDate, int seconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.SECOND, seconds);
        return calendar;
    }

    public Calendar addsSubsMinutes(Date actualDate, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.MINUTE, -1);
        calendar.add(Calendar.MINUTE, minutes + 1);
        return calendar;
    }

    public Calendar addsSubsHours(Date actualDate, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.HOUR, hours);
        return calendar;
    }

    public Calendar convertStringToDate(String setDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(setDate.split("/")[2]),
                Integer.parseInt(setDate.split("/")[0]),
                Integer.parseInt(setDate.split("/")[1]));
        return calendar;
    }
}
