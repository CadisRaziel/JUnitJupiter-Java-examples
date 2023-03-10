import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    //Assumptions tem haver com hipotese, suposição etc..

    @Test
    //vamos presumir que isso só sera executado em determinada circustanci
    void validarAlgoSomenteNoUsuarioVitor(){
        //presuma que o usuario logado agora é true
        Assumptions.assumeTrue("user".equals(System.getenv("USER")));

        //presuma que o usuario logado agora é false
        Assumptions.assumeFalse("user".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
