import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Curso curso2 = new Curso();

        curso.setTitulo("Java");
        curso.setDescricao("Curso Java");
        curso.setCargaHoraria(8);

        curso2.setTitulo("JS");
        curso2.setDescricao("Curso JS");
        curso2.setCargaHoraria(4);

        System.out.println(curso);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);





    }
}
