import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente() {
        //nasceu em 2000, mes1, dia1, 15hrs, 0minutos, 0segundos
        Pessoa pessoa = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(23, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade() {
        //nasceu em 2000, mes1, dia1, 15hrs, 0minutos, 0segundos
        Pessoa pessoa = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        //como é um boolean eu uso 'assertTrue', e se eu sei que vai ser true eu coloco assertTrue
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());


        Pessoa pessoa1 = new Pessoa("Jessica", LocalDateTime.of(2023, 1, 1, 15, 0, 0));
        //como eu sei que é pra ser falso eu coloco 'assertFalse'
        Assertions.assertFalse(pessoa1.ehMaiorDeIdade());
    }


    @Test //-> Anotação da dependencia JUnitJupiter
    void estruturaDeUmTest() {
        //criando um cenario
        Pessoa pessoa = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));

        //executando a validação
        Assertions.assertEquals(23, pessoa.getIdade());
    }
}
