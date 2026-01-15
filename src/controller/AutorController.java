package controller;

import model.AutorModel;
import service.AutorService;

import java.util.List;

public class AutorController {
    private AutorService service;

    public AutorController(){
        this.service = new AutorService();
    }

    public String registrarAutor(int id, String nome){
        return service.registrarAutor(id, nome);
    }

    public AutorModel listarAutor(int id){
        return null;
    }

    public List<AutorModel> listarAutores(){
        return null;
    }
}
