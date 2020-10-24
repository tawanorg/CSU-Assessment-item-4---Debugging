
import library.entities.Calendar;
import library.entities.ICalendar;
import library.entities.helpers.LibraryFileHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.*;
import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendarTest {
    ICalendar calendar;

    @BeforeEach
    @DisplayName("Test Before: setup important variables")
    void setUp() {
        calendar = Calendar.getInstance();
    }

    @Test()
    @DisplayName("Test: get number of day different from current date")
    void testGetDaysDifferenceFromToday() {
        Date targetDate = calendar.getDate();
        long numberOfDays = calendar.getDaysDifference(targetDate);
        assertEquals(0, numberOfDays);
    }

    @Test()
    @DisplayName("Test: get number of day different between next 5 days and today")
    void testGetDaysDifferenceFromLastWeek() {
        int numberOfTargetDate = 5;
        calendar.incrementDate(numberOfTargetDate);

        long expectedNumberOfDays = calendar.getDaysDifference(new Date());
        assertEquals(numberOfTargetDate - 1, expectedNumberOfDays);
    }

}
