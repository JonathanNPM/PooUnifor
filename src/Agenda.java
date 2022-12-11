import java.util.ArrayList;

public class Agenda {

    ArrayList<Consulta> lista = new ArrayList<Consulta>();

    public void adicionar(Consulta consulta) {
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getHora() == consulta.getHora() &&
                        lista.get(i).getDia() == consulta.getDia() &&
                        lista.get(i).getMes() == consulta.getMes() &&
                        lista.get(i).getAno() == consulta.getAno()) {
                    throw new Exception();
                }
            }
            System.out.println("Consulta agendada!");
            lista.add(consulta);
        } catch (Exception e) {
            System.out.println("Horario Ocupado.");
        }
    }

    public void confirmar(Consulta consulta) {
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getHora() == consulta.getHora() &&
                        lista.get(i).getDia() == consulta.getDia() &&
                        lista.get(i).getMes() == consulta.getMes() &&
                        lista.get(i).getAno() == consulta.getAno()) {

                    if (lista.get(i).getStatus() == 0) {
                        System.out.println("Consulta confirmada!");
                        lista.get(i).setStatus(1);
                    } else {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Status Invalido.");
        }
    }

    public void realizar(Consulta consulta) {
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getHora() == consulta.getHora() &&
                        lista.get(i).getDia() == consulta.getDia() &&
                        lista.get(i).getMes() == consulta.getMes() &&
                        lista.get(i).getAno() == consulta.getAno()) {

                    if (lista.get(i).getStatus() == 1) {
                        System.out.println("Consulta realizada!");
                        lista.get(i).setStatus(2);
                    } else {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Consulta nao encontrada.");
        }
    }

    public void cancelar(Consulta consulta) {
        try {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getHora() == consulta.getHora() &&
                        lista.get(i).getDia() == consulta.getDia() &&
                        lista.get(i).getMes() == consulta.getMes() &&
                        lista.get(i).getAno() == consulta.getAno()) {

                    if (lista.get(i).getStatus() == 0 || lista.get(i).getStatus() == 1) {
                        System.out.println("Consulta cancelada.");
                        lista.get(i).setStatus(3);
                        return;
                    } else {
                        throw new Exception("Status Invalido.");
                    }
                }
            }
            throw new Exception("Consulta nao encontrada.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listar(int dia, int mes, int ano) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDia() == dia &&
                    lista.get(i).getMes() == mes &&
                    lista.get(i).getAno() == ano) {
                System.out.println(lista.get(i));
            }
        }
    }

    public void pesquisar(String cpf) {
        boolean naoExiste = true;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPaciente().getCpf().equals(cpf)) {
                System.out.println(lista.get(i));
                naoExiste = false;
            }
        }
        if(naoExiste){
            System.out.println("consulta nao encontrada");
        }

    }

}
