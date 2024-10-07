package prestamoCelularTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;
import prestamoCelular.DateUtils;
import prestamoCelular.Disponible;
import prestamoCelular.Registrar;

public class PrestamoTest {

    Disponible disponible = Mockito.mock(Disponible.class);
    Registrar registrar = Mockito.mock(Registrar.class);

    @ParameterizedTest
    @CsvSource(
            {
                    "'S23','Samsung','Andres'",
                    "'Iphone14','Iphone','Valentina'",
                    "'A1','Xiaomi','Carlos'"
            }
    )


    public void prestamoCelular(String modelo, String marca, String usuario){
        DateUtils prestamo = new DateUtils();
        Mockito.when(disponible.estaDisponible(modelo, marca)).thenReturn(true);
        Mockito.when(registrar.registrarPrestamo(modelo,marca,usuario)).thenReturn(true);

        String day = prestamo.getDayOfWeek("MONDAY");
        Assertions.assertEquals("MONDAY", day, "ERROR no se puede prestar ese día");

        Mockito.verify(disponible).estaDisponible(modelo, marca);
        Mockito.verify(registrar).registrarPrestamo(modelo, marca, usuario);
    }

}
