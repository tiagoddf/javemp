/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author luiz
 */
public class beansFuncionarios {
    
    
    private int id;
    private String usuario;
    private String senha;
    private String cargo;
    private String pesquisa;
    private int ramal;
    private String nomecompleto;
    private String tipoPesquisa;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param codigo the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // cargo
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    // ramal
    public int getRamal() {
        return ramal;
    }
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    // nome completo
    public String getNomeCompleto() {
        return getNomecompleto();
    }
    public void setNomeCompleto(String nomecompleto) {
        this.setNomecompleto(nomecompleto);
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the nomecompleto
     */
    public String getNomecompleto() {
        return nomecompleto;
    }

    /**
     * @param nomecompleto the nomecompleto to set
     */
    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    /**
     * @return the tipoPesquisa
     */
    public String getTipoPesquisa() {
        return tipoPesquisa;
    }

    /**
     * @param tipoPesquisa the tipoPesquisa to set
     */
    public void setTipoPesquisa(String tipoPesquisa) {
        this.tipoPesquisa = tipoPesquisa;
    }

    
    
}
