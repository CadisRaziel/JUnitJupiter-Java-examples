import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTeste {
    //vamos presumir que isso só sera executado em determinada circustanci
    @Test

    //o assumeTrue
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Vitor")

    //o assumeFalse
    @DisabledIfEnvironmentVariable(named = "USER", matches = "Vitor")


    //quero rodar os testes só se for no linux
    //@EnabledOnOs(OS.LINUX);

    //posso testar apenas nesses sistemas operacionais
    //@EnabledOnOs({OS.MAC, OS.LINUX});

    //executa só se for a versão escolhida aqui
    //@EnabledOnJre(JRE.JAVA_8);

    //falo um minimo e um maximo de versão
    //@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17);
    void validarAlgoSomenteNoUsuarioVitor() {
    // Colocando essa anotação  @EnabledIfEnvironmentVariable(named = "USER", matches = "Vitor"
    //eu nao preciso mais fazer esse assumeTrue
    //Assumptions.assumeTrue("user".equals(System.getenv("USER")));

    // Colocando essa anotação  @EnabledIfEnvironmentVariable(named = "USER", matches = "Vitor"
    //eu nao preciso mais fazer esse assumeFalse
    //Assumptions.assumeFalse("user".equals(System.getenv("USER")));
    Assertions.assertEquals(10, 5 + 5);
    }
}
