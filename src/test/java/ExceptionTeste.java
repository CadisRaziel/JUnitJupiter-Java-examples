import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTeste {
    @Test
    void validaCenariodDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));


        //assertDoesNotThrow -> verifica se nao vai lançar exceção nesse caso abaixo
        //como la na classe eu tratei se for menor que 0 ele nao aceita então ele vai lançar a exceçao e dar errado o test
        //porém o importante é a gente tratar la na classe, ou seja mesmo o test dando errado, deu certo
        assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
