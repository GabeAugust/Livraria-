package model;

import java.time.LocalDate;

public class LivroModel {

    private int id;
    private String titulo;
    private AutorModel autorModel;
    private boolean disponivel;
    private LocalDate dataDePublicacao;

    public LivroModel(int id, String titulo, AutorModel autorModel, boolean disponivel, LocalDate dataDePublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autorModel = autorModel;
        this.disponivel = disponivel;
        this.dataDePublicacao = dataDePublicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return """

           ─────────────────────
           ID: %d
           Título: %s
           Autor: %s
           Disponível: %s
           Data de Publicação: %s
           """.formatted(
                id,
                titulo,
                autorModel.getNome(),
                disponivel ? "Sim" : "Não",
                dataDePublicacao
        );
    }
}
