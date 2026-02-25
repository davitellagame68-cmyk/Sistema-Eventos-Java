import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        SistemaEventos sistema = new SistemaEventos();

        Usuario usuario1 = new Usuario(
                1,
                "Davi Marques Santos Provasi",
                "davimarquess136@gmail.com",
                "Boituva"
        );

        sistema.cadastrarUsuario(usuario1);

        Evento evento1 = new Evento(
                "Feira de Tecnologia",
                "Centro de Boituva",
                "Tecnologia",
                LocalDateTime.now(),
                "Evento sobre inovação e tecnologia."
        );

        sistema.cadastrarEvento(evento1);

        evento1.participar(usuario1);
        evento1.cancelarParticipacao(usuario1);

        System.out.println("\nLista de Eventos:");
        sistema.listarEventos();

        sistema.salvarEventos();
    }
}