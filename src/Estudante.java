
public class Estudante {
    private String nome;
    private String cpf;

    public Estudante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters e setters PEGANDO O CPF

    public String getCpf() {

        return cpf;
    }
    // PEGANDO O NOME

    public String getNome() {

        return nome ;
    }

    // VALIDAÇÃO DO CPF

    private void isValid(String cpf) throws Exception {
        if (cpf.length() != 11)
            throw new Exception("CPF deve ter 11 dígitos.");
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCpf(String cpf) throws Exception {
        isValid(cpf);

        this.cpf = cpf;
    }
}


