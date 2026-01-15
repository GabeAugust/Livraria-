package controller;

import model.LivroModel;
import service.LivroService;

public class LivroController {
    private LivroService service;

    public LivroController(){
        this.service = new LivroService();
    }

    public String registrarLivro(LivroModel livroModel){
        return "Livro Criado com sucesso" + service.registrarLivro(livroModel);
    }
}
