import org.example.BancoDeDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosDePessoasTest {

    @BeforeAll //-> quero que aconteça antes de todos os testes (execução unica)
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }


    @BeforeEach //-> executa antes e depois de cada teste que existe aqui na nossa classe (Se existe 2 @Test ele executa 2 vezes e assim vai..)
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Buzz", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach //-> executa antes e depois de cada teste que existe aqui na nossa classe (Se existe 2 @Test ele executa 2 vezes e assim vai..)
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Buzz", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        assertNull(null);
    }

    @AfterAll //-> quero que aconteça depois de todos os testes (execução unica)
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

}
