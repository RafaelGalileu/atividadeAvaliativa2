package pm_prova2;

public class Spinning extends Atividade implements ControladorPresenca{

    private int quantidadeBike;

    public Spinning(String nome, String horario, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal,
            StatusAtividade status, int quantidadeBike) {
        super(nome, horario, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.quantidadeBike = quantidadeBike;
    }

    public void exibirDetalhes() {

        System.out.println(this.toString());
    }

    public boolean atividadeColetiva() {

        return true;
    }

    public void registrarPresenca(String nomeParticipante) {

        System.out.println("Presença para " +nomeParticipante +" registrada no Spinning.");
        
    }

    public int getQuantidadeBike() {
        return quantidadeBike;
    }

    public void setQuantidadeBike(int quantidadeBike) {
        this.quantidadeBike = quantidadeBike;
    }

    @Override
    public String toString() {
        return "Spinning [quantidadeBike=" + quantidadeBike + ", getNome()=" + getNome() + ", getDuracaoAula()="
                + getDuracaoAula() + ", getQuantidadeMaximaParticipantes()=" + getQuantidadeMaximaParticipantes()
                + ", getValorMensal()=" + getValorMensal() + ", getStatus()=" + getStatus() + ", atividadeColetiva()="
                + atividadeColetiva() + ", getHorario()=" + getHorario() + "]";
    }

}
