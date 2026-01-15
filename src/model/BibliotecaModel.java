package model;

import java.util.ArrayList;

public class BibliotecaModel {
    private ArrayList<LivroModel> livros = new ArrayList<LivroModel>();
    private ArrayList<AutorModel> autores = new ArrayList<AutorModel>();
    private ArrayList<Object> emprestimos = new ArrayList<Object>();

    public ArrayList<LivroModel> getLivros() {
        return livros;
    }

    public void setLivros(LivroModel livros) {
        this.livros.add(livros);
    }

    public ArrayList<AutorModel> getAutores() {
        return autores;
    }

    public void setAutores(AutorModel autores) {
        this.autores.add(autores);
    }

    public ArrayList<Object> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Object> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
