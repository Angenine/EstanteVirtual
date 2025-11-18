/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Angeline54656706
 */
public class CadastroDTO {
    private int id;
    private String tipo;
    private String nome;
    private String genero;
    private int nota;
    private boolean favorito;
    
    public int getId() {
    return id;
    }
    public String getTipo() {
    return tipo;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public int getNota() {
        return nota;
    }
    public boolean isFavorito() {
        return favorito;
    }
    
    public void setId(int id) {
    this.id = id;
    }
    public void setTipo(String tipo) {
    this.tipo = tipo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }  
}
