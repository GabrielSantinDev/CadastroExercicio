
package com.mycompany.exercicios.model;

/**
 *
 * @author User
 */
public class Usuario {
    
    private String nomeCompleto;
    private String email;
    private String senha;
    private String funcao;

    public Usuario() {
    }

    public Usuario(String nomeCompleto, String email, String senha, String funcao) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.funcao = funcao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomeCompleto=" + nomeCompleto + ", email=" + email + ", senha=" + senha + ", funcao=" + funcao + '}';
    }
}
