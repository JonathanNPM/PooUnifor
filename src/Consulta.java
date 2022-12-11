public class Consulta {

    private Paciente paciente;
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private int status;

    public Consulta(Paciente paciente, int hora, int dia, int mes, int ano) {
        this.paciente = paciente;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.status = 0;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("nome: %s data: %s/%s/%d hora: %s:00", paciente.getNome(),
                dia < 10 ? "0" + dia : dia, mes < 10 ? "0" + mes : mes, ano, hora < 10 ? "0" + hora : hora);
    }
}
