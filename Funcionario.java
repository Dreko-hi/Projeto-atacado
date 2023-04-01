package br.com.atacado.dominio;

import java.time.LocalDate;

public class Funcionario extends PessoaFisica {

    private String matricula;

    private String login;

    private String senha;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae, String matricula, String login, String senha) {
        super(codigoPessoa, nome, email, site, dataInclusao, cpf, rg, sexo, raca, nacionalidade, naturalidade, nomePai,
                nomeMae);
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public void Imprimir() {
        System.out.println("-- Detalhes do funcionário --");
        System.out.println("Código da Pessoa: " + this.codigoPessoa);
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Site: " + this.site);
        System.out.println("Data de Inclusão: " + this.dataInclusao);
        System.out.println("CPF: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Raça: " + this.getRaca());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Naturalidade: " + this.getNaturalidade());
        System.out.println("Nome do Pai: " + this.getNomePai());
        System.out.println("Nome da Mãe: " + this.getNomeMae());
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Login: " + this.login);
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                "codigoPessoa=" + codigoPessoa +
                ", nome=" + nome +
                ", email=" + email +
                ", site=" + site +
                ", dataInclusao=" + dataInclusao +
                ", cpf=" + getCpf() +
                ", rg=" + getRg() +
                ", sexo=" + getSexo() +
                ", raca=" + getRaca() +
                ", nacionalidade=" + getNacionalidade() +
                ", naturalidade=" + getNaturalidade() +
                ", nomePai=" + getNomePai() +
                ", nomeMae=" + getNomeMae() +
                ", matricula=" + matricula +
                ", login=" + login
                + "]";
    }

}
