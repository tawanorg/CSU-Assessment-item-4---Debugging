import library.entities.*;
import library.entities.helpers.BookHelper;
import library.entities.helpers.LibraryFileHelper;
import library.entities.helpers.LoanHelper;
import library.entities.helpers.PatronHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    ICalendar calendar;
    ILibrary library;

    @BeforeEach
    @DisplayName("Test Before: setup important variables")
    void setUp() {
        calendar = Calendar.getInstance();
        LibraryFileHelper libraryHelper =  new LibraryFileHelper(new BookHelper(), new PatronHelper(), new LoanHelper());
        library = libraryHelper.loadLibrary();
    }

    @Test()
    @DisplayName("Test: If calculate overdue fine correctly")
    void testCalculateOverDueFineCorrectly() {
        ILoan loan = library.getCurrentLoanByBookId(1);

        double actualAmount = library.calculateOverDueFine(loan);

        loan.getPatron().incurFine(actualAmount);

        double expectedAmount = loan.getPatron().getFinesPayable();

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

     
}
