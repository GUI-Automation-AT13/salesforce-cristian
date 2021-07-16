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
        System.out.println(expected.getTime());
        System.out.println(expected.get(Calendar.MILLISECOND));
        expected.add(Calendar.MONTH, 1);
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainDateTomorrow() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.obtainDate("tomorrow");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.DAY_OF_MONTH, 1);
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainDateYesterday() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        Calendar actual = dateActualAfterBefore.obtainDate("yesterday");
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.DAY_OF_MONTH, -1);
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainDateDate() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String setDate = "7/14/2021";
        Calendar actual = dateActualAfterBefore.obtainDate(setDate);
        assertEquals(actual.get(Calendar.YEAR), Integer.parseInt(setDate.split("/")[2]));
        assertEquals(actual.get(Calendar.MONTH), Integer.parseInt(setDate.split("/")[0]));
        assertEquals(actual.get(Calendar.DAY_OF_MONTH), Integer.parseInt(setDate.split("/")[1]));
    }

    @Test
    public void testObtainDateDate2() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String setDate = "0007/0014/2021";
        Calendar actual = dateActualAfterBefore.obtainDate(setDate);
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
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainMonthsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 months ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MONTH, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainYearsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 years ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.YEAR, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainHoursAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 hours ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.HOUR, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainMinutesAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 minutes ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MINUTE, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainSecondsAgo() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 seconds ago";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.SECOND, - Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainDaysFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "4 days from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.DAY_OF_MONTH, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainMonthsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "2 month from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MONTH, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainYearsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 years from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.YEAR, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainHoursFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "3 hours from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.HOUR, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainMinutesFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 minutes from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.MINUTE, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
    }

    @Test
    public void testObtainSecondsFuture() {
        DateActualAfterBefore dateActualAfterBefore = new DateActualAfterBefore();
        String textDate = "15 seconds from now";
        Calendar actual = dateActualAfterBefore.obtainDate(textDate);
        Calendar expected = Calendar.getInstance();
        expected.add(Calendar.MONTH, 1);
        expected.add(Calendar.SECOND, Integer.parseInt(textDate.split(" ")[0]));
        assertEquals(actual.getTime().toString(), expected.getTime().toString());
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
}