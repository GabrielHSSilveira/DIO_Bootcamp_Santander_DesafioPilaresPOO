
import br.com.bootcamp.Bootcamp;
import br.com.bootcamp.grade.cursos.Curso;
import br.com.bootcamp.grade.mentorias.Mentoria;
import br.com.bootcamp.participantes.Dev;


public class Main {
    public static void main(String[] args) {


        // Criando objetos Bootcamp, Curso, Mentoria e Dev
        Bootcamp bootcamp = new Bootcamp("Java Full Stack");
        Curso curso1 = new Curso("Java Basics", "Curso introdutório de Java", 40);
        Mentoria mentoria1 = new Mentoria("Mentoria de Projetos", "Ajuda com projetos em Java", "Segunda-feira 15:00");
        Dev dev1 = new Dev("Alice", 25, "Júnior");

        // Relacionando objetos
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarMentoria(mentoria1);
        bootcamp.adicionarDev(dev1);

        curso1.iniciar();
        mentoria1.iniciar();

    }
}