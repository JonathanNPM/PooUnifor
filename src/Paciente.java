public class Paciente {

    private String nome;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
