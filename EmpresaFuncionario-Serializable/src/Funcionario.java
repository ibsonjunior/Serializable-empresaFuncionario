import java.io.Serializable;

public class Funcionario implements Serializable {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String empresa;
    private String cnpjEmpresa;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String cpf, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.empresa = "DH";
        this.cnpjEmpresa = "123.456.978/0001";
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", empresa='" + empresa + '\'' +
                ", cnpjEmpresa='" + cnpjEmpresa + '\'' +
                ", salario=" + salario +
                '}';
    }
}
