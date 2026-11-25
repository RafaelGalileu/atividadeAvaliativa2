package pm_prova2;

public class Natacao extends Atividade implements Certificavel, ControladorPresenca{

    private double profundidade;

    public Natacao(String nome, String horario, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal,
            StatusAtividade status, double profundidade) {
        super(nome, horario, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.profundidade = profundidade;
    }

    public void exibirDetalhes() {

        System.out.println(this.toString());
    }

    public boolean atividadeColetiva() {

        return true;
    }


    public void emitirCertificado(String nomeParticipante) {

        System.out.println("Certifica emitido para " +nomeParticipante +", parabéns!");
    }

    public void registrarPresenca(String nomeParticipante) {

        System.out.println("Presença para " +nomeParticipante +" registrada na Natação.");

    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Natacao [profundidade=" + profundidade + ", getNome()=" + getNome() + ", getDuracaoAula()="
                + getDuracaoAula() + ", getQuantidadeMaximaParticipantes()=" + getQuantidadeMaximaParticipantes()
                + ", getValorMensal()=" + getValorMensal() + ", getStatus()=" + getStatus() + ", atividadeColetiva()="
                + atividadeColetiva() + ", getHorario()=" + getHorario() + "]";
    }

}
