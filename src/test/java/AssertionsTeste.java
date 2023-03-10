import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

//Fazendo importação static dessa forma, a gente evita de fica escrevendo 'Assertions' antes do metodo
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


//Outra forma ao static é por um * no final e pronto.
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {
    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};

        //se o segundo lançamento é igual o primeiro (vai comparar os indices se são iguais, se tem tamanho igual etc..)
        //assertArrayEquals(primeiroLancamento, segundoLancamento);

        //para ver se os arrays são diferentes
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNullo(){
        Pessoa pessoa = null;
        //para ver se a pessoa é nulla
        assertNull(pessoa);

        Pessoa pessoa1 = new Pessoa("Lua", LocalDateTime.now());
        //para ver se a pessoa não é nulla
        assertNotNull(pessoa1);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5d;
        double outroValor = 5d;

        assertEquals(valor, outroValor);
    }
}
