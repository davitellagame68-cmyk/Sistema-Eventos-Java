import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class SistemaEventos {

    private List<Usuario> usuarios;
    private List<Evento> eventos;

    public SistemaEventos() {
        usuarios = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento cadastrado com sucesso!");
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (Evento evento : eventos) {
                System.out.println("Nome: " + evento.getNome());
                System.out.println("Endereço: " + evento.getEndereco());
                System.out.println("Categoria: " + evento.getCategoria());
                System.out.println("Horário: " + evento.getHorario());
                System.out.println("Descrição: " + evento.getDescricao());
                System.out.println("---------------------------");
            }
        }
    }

    public void salvarEventos() {
        try {
            FileWriter writer = new FileWriter("events.data");

            for (Evento evento : eventos) {
                writer.write("Nome: " + evento.getNome() + "\n");
                writer.write("Endereço: " + evento.getEndereco() + "\n");
                writer.write("Categoria: " + evento.getCategoria() + "\n");
                writer.write("Horário: " + evento.getHorario() + "\n");
                writer.write("Descrição: " + evento.getDescricao() + "\n");
                writer.write("---------------------------\n");
            }

            writer.close();
            System.out.println("Eventos salvos no arquivo events.data com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar eventos.");
            e.printStackTrace();
        }
    }
}