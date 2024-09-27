package CodeReview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringFormatTest {
    public static final StringFormatter STRING_FORMATTER = new StringFormatter();

    @Test
    public void testStringFormat() {
        //given
        String input = "i spent on %d%s of %s %d %f %s";
        Object[] args = List.of(11,"th", "May", 2022, 98.73, "USD").toArray();
        String expectedResult = "i spent on 11th of May 2022 98.73 USD";
        //when
        String actualOutput = STRING_FORMATTER.formatString(input, args);
        //then
        Assertions.assertEquals(expectedResult, actualOutput);

    }


}