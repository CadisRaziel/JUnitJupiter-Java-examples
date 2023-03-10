import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //-> anotação de definição da ordem dos testes

//ordem pelo nome do methodo (ou seja pela ordem alfabetica, obs: eu nao preciso colocar a anotação "@Order()"
//@TestMethodOrder(MethodOrderer.MethodName.class)


//faz os testes em ordem aleatoria, obs: eu nao preciso colocar a anotação "@Order()"
//@TestMethodOrder(MethodOrderer.Random.class)

//Nomeia nosso teste de alguma forma, preciso colocar a anotação "@DisplayName("A")"
//@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    //@DisplayName("A")
    @Order(4) //-> ordem de execução
    @Test
    void validaFluxoA() {
        assertTrue(true);
    }

    //@DisplayName("B")
    @Order(2) //-> ordem de execução
    @Test
    void validaFluxoB() {
        assertTrue(true);
    }

    //@DisplayName("C")
    @Order(1) //-> ordem de execução
    @Test
    void validaFluxoC() {
        assertTrue(true);
    }

    //@DisplayName("D")
    @Order(3) //-> ordem de execução
    @Test
    void validaFluxoD() {
        assertTrue(true);
    }
}
