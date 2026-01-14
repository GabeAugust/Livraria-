package model;

import java.time.LocalDate;

public class LivroModel {

    private Long id;
    private String titulo;
    private AutorModel autorModel;
    private boolean disponivel;
    private LocalDate dataDePublicacao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AutorModel getAutorModel() {
        return autorModel;
    }

    public void setAutorModel(AutorModel autorModel) {
        this.autorModel = autorModel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(LocalDate dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }
}
