package prestamoCelularTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import prestamoCelular.DateUtils;

public class PrestamoTest {

    @ParameterizedTest
    @CsvSource(
            {
                    "S23,Samsung,Andres",
                    "Iphone14,Iphone,Valentina",
                    ",Xiaomi,Carlos"
            }
    )



    public String prestamoCelular(String modelo, String marca, String usuario){
        DateUtils prestamo = new DateUtils();

    }

}
