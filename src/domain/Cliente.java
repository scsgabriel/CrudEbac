package domain;

import java.util.Objects;

public class Cliente {

    //características do cliente
    private String nome;
    private Long cpf;
    private Long telefone;
    private String endereco;
    private Integer numero;
    private String cidade;
    private String estado;


    //construtor
    public Cliente(String nome, String cpf, String telefone, String endereco, String numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.parseLong(cpf);
        this.telefone = Long.parseLong(telefone);
        this.endereco = endereco;
        this.numero = Integer.parseInt(numero);
        this.cidade = cidade;
        this.estado = estado;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //equals e hashCode    ->  serve pra fazer comparação de um dado com outro dado, retorna um boolean
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    //toString

    @Override
    public String toString() {
        return "domain.Cliente{" +
                "nome = " + nome + '\'' +
                ", cpf = " + cpf +
                '}';
    }
}
