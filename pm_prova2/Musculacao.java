package pm_prova2;

public class Musculacao extends Atividade{

    private int numAparelhos;

    

    public Musculacao(String nome, String horario, int duracaoAula, int quantidadeMaximaParticipantes,
            double valorMensal, StatusAtividade status, int numAparelhos) {
        super(nome, horario, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.numAparelhos = numAparelhos;
    }

    public void exibirDetalhes() {
        
        System.out.println(this.toString());
    }

    public boolean atividadeColetiva() {

        return false;
    }
    


    public int getNumAparelhos() {
        return numAparelhos;
    }

    public void setNumAparelhos(int numAparelhos) {
        this.numAparelhos = numAparelhos;
    }

    @Override
    public String toString() {
        return "Musculacao [numAparelhos=" + numAparelhos + ", atividadeColetiva()=" + atividadeColetiva()
                + ", getNome()=" + getNome() + ", getDuracaoAula()=" + getDuracaoAula()
                + ", getQuantidadeMaximaParticipantes()=" + getQuantidadeMaximaParticipantes() + ", getValorMensal()="
                + getValorMensal() + ", getStatus()=" + getStatus() + ", getHorario()=" + getHorario() + "]";
    }

    

    
    
}
