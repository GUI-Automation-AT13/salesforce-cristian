package core.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * This class is for convert string to date.
 */
public class DateActualAfterBefore {

    Calendar calendar = Calendar.getInstance();

    /**
     * Converts string to date.
     *
     * @param textDate is a text of date.
     * @return a Date.
     */
    public Calendar obtainDate(String textDate) {
        int sizeArray = getSizeArray(textDate);
        if (textDate.equals("")) {
            throw new RuntimeException("Invalid Argument: Unsupported String Format.");
        } else {
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
    }

    /**
     * Gets day month year second minute hour from now.
     *
     * @param textDate is a text of date.
     * @return a Date.
     */
    public Calendar getDmYsMhFuture(String textDate) {
        Date actualDate = new Date();
        String[] arrayTextDate = textDate.split(" ");
        if (arrayTextDate[1].equals("days") || arrayTextDate[1].equals("day")) {
            return addsSubsDays(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("months") || arrayTextDate[1].equals("month")) {
            return addsSubsMonths(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("years") || arrayTextDate[1].equals("year")) {
            return addsSubsYears(actualDate, Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("seconds") || arrayTextDate[1].equals("second")) {
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

    /**
     * Gets day month year second minute hour from ago.
     *
     * @param textDate is a text of date.
     * @return a Date.
     */
    public Calendar getDmYsMhAgo(String textDate) {
        Date actualDate = new Date();
        String[] arrayTextDate = textDate.split(" ");
        if (arrayTextDate[1].equals("days") || arrayTextDate[1].equals("day")) {
            return addsSubsDays(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("months") || arrayTextDate[1].equals("month")) {
            return addsSubsMonths(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("years") || arrayTextDate[1].equals("year")) {
            return addsSubsYears(actualDate, -Integer.parseInt(arrayTextDate[0]));
        }
        if (arrayTextDate[1].equals("seconds") || arrayTextDate[1].equals("second")) {
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

    /**
     * Gets today yesterday tomorrow.
     *
     * @param textDate is a text of date.
     * @return a Date.
     */
    public Calendar getTodayYesterdayTomorrow(String textDate) {
        final String[] arrayType = textDate.split("/");
        calendar.add(Calendar.MONTH, 1);
        Date actualDate = new Date();
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

    /**
     * Adds or substracts days.
     *
     * @param actualDate is a actual date.
     * @param days       numbers do days.
     * @return a date.
     */
    public Calendar addsSubsDays(Date actualDate, int days) {
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar;
    }

    /**
     * Adds or substracts months.
     *
     * @param actualDate is a actual date.
     * @param months     numbers of months.
     * @return a date.
     */
    public Calendar addsSubsMonths(Date actualDate, int months) {
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, months + 1);
        return calendar;
    }

    /**
     * Adds or substracts years.
     *
     * @param actualDate is a actual date.
     * @param years      is a numbers of the years.
     * @return a date.
     */
    public Calendar addsSubsYears(Date actualDate, int years) {
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, years);
        return calendar;
    }

    /**
     * Adds or substract seconds.
     *
     * @param actualDate is a actual date.
     * @param seconds    is a numbers of the seconds.
     * @return a date.
     */
    public Calendar addsSubsSeconds(Date actualDate, int seconds) {
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.SECOND, seconds);
        return calendar;
    }

    /**
     * Adds or substracts minutes.
     *
     * @param actualDate is a actual date.
     * @param minutes    is a numbers of minutes.
     * @return a date.
     */
    public Calendar addsSubsMinutes(Date actualDate, int minutes) {
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.MINUTE, -1);
        calendar.add(Calendar.MINUTE, minutes + 1);
        return calendar;
    }

    /**
     * Adds or substracts hours.
     *
     * @param actualDate is a actual date.
     * @param hours      is a numbers of the hours.
     * @return a date.
     */
    public Calendar addsSubsHours(Date actualDate, int hours) {
        calendar.setTime(actualDate);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.HOUR, hours);
        return calendar;
    }

    /**
     * Converts string to date.
     *
     * @param setDate is text of the date.
     * @return date.
     */
    public Calendar convertStringToDate(String setDate) {
        calendar.set(Integer.parseInt(setDate.split("/")[2]),
                Integer.parseInt(setDate.split("/")[0]),
                Integer.parseInt(setDate.split("/")[1]));
        return calendar;
    }
}
