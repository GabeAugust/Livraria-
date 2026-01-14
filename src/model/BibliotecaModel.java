package model;

import java.util.ArrayList;

public class BibliotecaModel {
    private ArrayList<LivroModel> livros = new ArrayList<LivroModel>();
    private ArrayList<AutorModel> autores = new ArrayList<AutorModel>();
    private ArrayList<Object> emprestimos = new ArrayList<Object>();

    public ArrayList<LivroModel> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<LivroModel> livros) {
        this.livros = livros;
    }

    public ArrayList<AutorModel> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<AutorModel> autores) {
        this.autores = autores;
    }

    public ArrayList<Object> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Object> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
