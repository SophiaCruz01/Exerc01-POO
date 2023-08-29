public class Pessoa {
    private String CPF;
    private String nome;
    private char sexo;
    private int idade;
    
    public void setCPF(String cpf) {
        CPF = cpf;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public String imprimir() {
        return "Nome: " + nome + "\nCPF: " + CPF + "\nSexo: " + sexo + "\nIdade: " + idade;
    }
}
    

