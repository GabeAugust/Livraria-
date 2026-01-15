package service;

import model.BibliotecaModel;
import model.LivroModel;

public class LivroService {
    private BibliotecaModel bibliotecaModel;

    public LivroService(){
        this.bibliotecaModel = new BibliotecaModel();
    }

    public String registrarLivro(LivroModel livroModel){
        LivroModel novoLivro = new LivroModel(
                livroModel.getId(),
                livroModel.getTitulo(),
                livroModel.getAutorModel(),
                livroModel.isDisponivel(),
                livroModel.getDataDePublicacao()
        );

        bibliotecaModel.setLivros(novoLivro);
        return novoLivro.toString();
    }

}
