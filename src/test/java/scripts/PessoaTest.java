package scripts;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void deveMudarONome() {
        //cenario
        Pessoa pessoa = new Pessoa("Douglas", LocalDate.now());
        //acao
        pessoa.setNome("Jordi");
        //valicao
        assertEquals("Jordi", pessoa.getNome());
    }


    @Test
    void deveSerMaiorDeIdade() {
        //cenario
        Pessoa jordi = new Pessoa("Jordi", LocalDate.now().minusYears(19));
        //acao
        boolean maiorDeIdade = jordi.isMaiorDeIdade();
        //validacao
        assertTrue(maiorDeIdade, "Deveria ser maior de idade");
    }

    @Test
    void naoDeveSerMaiorDeIdade() {
        //cenario
        Pessoa jordi = new Pessoa("Jordi", LocalDate.now().minusYears(18));
        //acao e validacao

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            jordi.isMaiorDeIdade();
        });
        assertNotNull(exception);
        assertEquals("Deveria ser maior de idade",exception.getMessage());
    }
}