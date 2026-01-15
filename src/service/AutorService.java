package service;

import model.AutorModel;
import model.BibliotecaModel;

public class AutorService {
    private BibliotecaModel bibliotecaModel;

    public AutorService(){
        this.bibliotecaModel = new BibliotecaModel();
    }
    public String registrarAutor(int id, String nome){
        AutorModel novoAutor = new AutorModel(id, nome);
        bibliotecaModel.setAutores(novoAutor);
        return novoAutor.toString();

    }
}
