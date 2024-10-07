package fechaTest;

import fecha.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FechaTest {

    @ParameterizedTest
    @CsvSource(
        {

            "'MONDAY','2024-10-07'",
            "'SATURDAY','2024-10-04'",
            "'FRIDAY','2024-10-07'",
            "'SUNDAY','2024-10-06'",
        }
    )

    public void verifyFecha(String expectedResult, String actualResult){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek(actualResult);
        Assertions.assertEquals(expectedResult, result, "ERROR la fecha es otro dia de la semana");
    }

}
