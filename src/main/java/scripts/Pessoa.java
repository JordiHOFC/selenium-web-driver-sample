package scripts;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isMaiorDeIdade(){
        int years = Period.between(this.dataNascimento, LocalDate.now()).getYears();

        if(years >= 18){
            return true;
        }
       throw new RuntimeException("Deveria ser maior de idade");
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
