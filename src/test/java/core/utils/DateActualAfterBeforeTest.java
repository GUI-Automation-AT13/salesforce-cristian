package core.utils;

import org.testng.annotations.Test;
import java.util.Calendar;
import static org.testng.Assert.*;

public class DateActualAfterBeforeTest {

    @Test
    public void testObtainDateToday() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.obtainDate("today");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainDateTomorrow() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.obtainDate("tomorrow");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.DAY_OF_MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainDateYesterday() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.obtainDate("yesterday");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.DAY_OF_MONTH, -1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainDateDate() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String setDate = "7/14/2021";
        Calendar actual = dateActualAfterBefore.obtainDate("7/14/2021");
        assertEquals(actual.get(Calendar.YEAR), Integer.parseInt(setDate.split("/")[2]));
        assertEquals(actual.get(Calendar.MONTH), Integer.parseInt(setDate.split("/")[0]));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), Integer.parseInt(setDate.split("/")[1]));
    }

    @Test
    public void testObtainDaysAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 days ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.DAY_OF_MONTH, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainMonthsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 months ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MONTH, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainYearsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 years ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.YEAR, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainHoursAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 hours ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.HOUR, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
    }

    @Test
    public void testObtainOneHourAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "1 hour ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.HOUR, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
    }

    @Test
    public void testObtainMinutesAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 minutes ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MINUTE, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
        assertEquals(actual.get(Calendar.MINUTE), expected.get(Calendar.MINUTE));
    }

    @Test
    public void testObtainSecondsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 seconds ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.SECOND, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
        assertEquals(actual.get(Calendar.MINUTE), expected.get(Calendar.MINUTE));
        assertEquals(actual.get(Calendar.SECOND), expected.get(Calendar.SECOND));
    }

    @Test
    public void testObtainDaysFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "4 days from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.DAY_OF_MONTH, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainMonthsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "2 month from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MONTH, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainYearsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 years from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.YEAR, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testObtainHoursFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 hours from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.HOUR, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
    }

    @Test
    public void testObtainOneHourFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "1 hour from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.HOUR, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
    }

    @Test
    public void testObtainMinutesFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 minutes from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MINUTE, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
        assertEquals(actual.get(Calendar.MINUTE), expected.get(Calendar.MINUTE));
    }

    @Test
    public void testObtainSecondsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 seconds from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.SECOND, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
        assertEquals(actual.get(Calendar.HOUR), expected.get(Calendar.HOUR));
        assertEquals(actual.get(Calendar.MINUTE), expected.get(Calendar.MINUTE));
        assertEquals(actual.get(Calendar.SECOND), expected.get(Calendar.SECOND));
    }

    @Test
    public void testGetSizeArray() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        int actual = dateActualAfterBefore.getSizeArray("today");
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testConvertStringToDate() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String setDate = "7/14/2021";
        Calendar actual = dateActualAfterBefore.convertStringToDate(setDate);
        assertEquals(actual.get(Calendar.YEAR), Integer.parseInt(setDate.split("/")[2]));
        assertEquals(actual.get(Calendar.MONTH), Integer.parseInt(setDate.split("/")[0]));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), Integer.parseInt(setDate.split("/")[1]));
    }

    @Test
    public void testGetTomorrow() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.getTodayYesterdayTomorrow("tomorrow");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH) + 1);
    }

    @Test
    public void testGetYesterday() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.getTodayYesterdayTomorrow("yesterday");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH) - 1);
    }

    @Test
    public void testGetToday() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.getTodayYesterdayTomorrow("today");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testGetDate() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String setDate = "7/14/2021";
        Calendar actual = dateActualAfterBefore.getTodayYesterdayTomorrow("7/14/2021");
        assertEquals(actual.get(Calendar.YEAR), Integer.parseInt(setDate.split("/")[2]));
        assertEquals(actual.get(Calendar.MONTH), Integer.parseInt(setDate.split("/")[0]));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), Integer.parseInt(setDate.split("/")[1]));
    }

    @Test
    public void testGetDaysAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 days ago";
        Calendar actual = dateActualAfterBefore.getDmYsMhAgo(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH) - Integer.parseInt(textDate.split(" ")[0]));
    }

    @Test
    public void testGetMonthsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 months ago";
        Calendar actual = dateActualAfterBefore.getDmYsMhAgo(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH) - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testGetYearsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 years ago";
        Calendar actual = dateActualAfterBefore.getDmYsMhAgo(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR)  - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testGetDaysFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "4 days from now";
        Calendar actual = dateActualAfterBefore.getDmYsMhFuture(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH) + Integer.parseInt(textDate.split(" ")[0]));
    }

    @Test
    public void testGetMonthsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "2 month from now";
        Calendar actual = dateActualAfterBefore.getDmYsMhFuture(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH) + Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void testGetYearsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 years from now";
        Calendar actual = dateActualAfterBefore.getDmYsMhFuture(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.get(Calendar.YEAR), expected.get(Calendar.YEAR) + Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.get(Calendar.MONTH), expected.get(Calendar.MONTH));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), expected.get(Calendar.DAY_OF_MONTH));
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testEmptyStringDate() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "";
        Calendar dateResult = dates.obtainDate(value);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testNullValueDate() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = null;
        Calendar dateResult = dates.obtainDate(value);
    }

    @Test
    public void testInvalidStringDate() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "data String invalid 65465 654 klj ";
        Calendar dateResult = dates.obtainDate(value);
        assertEquals(dateResult, null, "Valid data");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testEmptyStringDategetDmYsMhFuture() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "";
        Calendar dateResult = dates.getDmYsMhFuture(value);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testNullValueDategetDmYsMhFuture() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = null;
        Calendar dateResult = dates.getDmYsMhFuture(value);
    }

    @Test
    public void testInvalidStringDategetDmYsMhFuture() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "data String invalid 65465 654 klj ";
        Calendar dateResult = dates.getDmYsMhFuture(value);
        assertEquals(dateResult, null, "Valid data");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testEmptyStringDategetDmYsMhAgo() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "";
        Calendar dateResult = dates.getDmYsMhAgo(value);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testNullValueDategetDmYsMhAgo() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = null;
        Calendar dateResult = dates.getDmYsMhAgo(value);
    }

    @Test
    public void testInvalidStringDategetDmYsMhAgo() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "data String invalid 65465 654 klj ";
        Calendar dateResult = dates.getDmYsMhAgo(value);
        assertEquals(dateResult, null, "Valid data");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testEmptyStringDategetTodayYesterdayTomorrow() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "";
        Calendar dateResult = dates.getTodayYesterdayTomorrow(value);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testNullValueDategetTodayYesterdayTomorrow() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = null;
        Calendar dateResult = dates.getTodayYesterdayTomorrow(value);
    }

    @Test
    public void testInvalidStringDategetTodayYesterdayTomorrow() {
        DateActualAfterBefore dates = new DateActualAfterBefore();
        String value = "data String invalid 65465 654 klj ";
        Calendar dateResult = dates.getTodayYesterdayTomorrow(value);
        assertEquals(dateResult, null, "Valid data");
    }
}