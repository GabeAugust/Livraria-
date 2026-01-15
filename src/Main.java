import controller.AutorController;
import controller.LivroController;
import model.AutorModel;
import model.LivroModel;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutorController controller = new AutorController();
        LivroController controller1 = new LivroController();
        AutorModel autor = new AutorModel(1, "Machado de Assis");
        System.out.println(controller.registrarAutor(autor.getId(), autor.getNome()));
        System.out.println(controller1.registrarLivro(new LivroModel(1,
                "Dom Casmurro",
                autor,
                true,
                LocalDate.of(1899, 1, 1))));
    }
}