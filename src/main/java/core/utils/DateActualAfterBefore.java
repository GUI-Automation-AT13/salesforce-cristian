package core.utils;

import java.util.Calendar;

/**
 * This class is for convert string to date.
 */
public class DateActualAfterBefore {

    Calendar calendar = Calendar.getInstance();
    final int numberFour = 4;
    final int numberThree = 3;
    final int numberOne = 1;

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
            if (sizeArray == numberOne) {
                return getTodayYesterdayTomorrow(textDate);
            }
            if (sizeArray == numberThree) {
                return getDmYsMhAgo(textDate);
            }
            if (sizeArray == numberFour) {
                return getDmYsMhFuture(textDate);
            }
        }
        return null;
    }

    /**
     * Gets day month year second minute hour from now.
     *
     * @param textDate is a text of date.
     * @return a Date.
     */
    public Calendar getDmYsMhFuture(String textDate) {
        String[] arrayTextDate = textDate.split(" ");
        if (textDate.equals("")) {
            throw new RuntimeException("Invalid Argument: Unsupported String Format.");
        } else {
            if (arrayTextDate[1].equals("days") || arrayTextDate[1].equals("day")) {
                return addsSubsDays(Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("months") || arrayTextDate[1].equals("month")) {
                return addsSubsMonths(Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("years") || arrayTextDate[1].equals("year")) {
                return addsSubsYears(Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("seconds") || arrayTextDate[1].equals("second")) {
                return addsSubsSeconds(Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("minutes") || arrayTextDate[1].equals("minute")) {
                return addsSubsMinutes(Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("hours") || arrayTextDate[1].equals("hour")) {
                return addsSubsHours(Integer.parseInt(arrayTextDate[0]));
            }
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
        String[] arrayTextDate = textDate.split(" ");
        if (textDate.equals("")) {
            throw new RuntimeException("Invalid Argument: Unsupported String Format.");
        } else {
            if (arrayTextDate[1].equals("days") || arrayTextDate[1].equals("day")) {
                return addsSubsDays(-Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("months") || arrayTextDate[1].equals("month")) {
                return addsSubsMonths(-Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("years") || arrayTextDate[1].equals("year")) {
                return addsSubsYears(-Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("seconds") || arrayTextDate[1].equals("second")) {
                return addsSubsSeconds(-Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("minutes") || arrayTextDate[1].equals("minute")) {
                return addsSubsMinutes(-Integer.parseInt(arrayTextDate[0]));
            }
            if (arrayTextDate[1].equals("hours") || arrayTextDate[1].equals("hour")) {
                return addsSubsHours(-Integer.parseInt(arrayTextDate[0]));
            }
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
        if (textDate.equals("")) {
            throw new RuntimeException("Invalid Argument: Unsupported String Format.");
        } else {
            if (textDate == "today") {
                calendar.add(Calendar.MONTH, 1);
                return calendar;
            }
            if (textDate == "tomorrow") {
                return addsSubsDays(1);
            }
            if (textDate == "yesterday") {
                return addsSubsDays(-1);
            }
            if (arrayType.length == numberThree) {
                return convertStringToDate("7/14/2021");
            }
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
     * @param days numbers do days.
     * @return a date.
     */
    public Calendar addsSubsDays(int days) {
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar;
    }

    /**
     * Adds or substracts months.
     *
     * @param months numbers of months.
     * @return a date.
     */
    public Calendar addsSubsMonths(int months) {
        calendar.add(Calendar.MONTH, months + 1);
        return calendar;
    }

    /**
     * Adds or substracts years.
     *
     * @param years is a numbers of the years.
     * @return a date.
     */
    public Calendar addsSubsYears(int years) {
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, years);
        return calendar;
    }

    /**
     * Adds or substract seconds.
     *
     * @param seconds is a numbers of the seconds.
     * @return a date.
     */
    public Calendar addsSubsSeconds(int seconds) {
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.SECOND, seconds);
        return calendar;
    }

    /**
     * Adds or substracts minutes.
     *
     * @param minutes is a numbers of minutes.
     * @return a date.
     */
    public Calendar addsSubsMinutes(int minutes) {
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.MINUTE, -1);
        calendar.add(Calendar.MINUTE, minutes + 1);
        return calendar;
    }

    /**
     * Adds or substracts hours.
     *
     * @param hours is a numbers of the hours.
     * @return a date.
     */
    public Calendar addsSubsHours(int hours) {
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
