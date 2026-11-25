package pm_prova2;



public class Basico extends Plano implements ControladorPresenca{

    private boolean presenca;
    private Atividade atividade;

    public Basico(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status, boolean presenca) {
        super(nome, valorMensal, quantidadeMaximaAtividades, status);
        this.presenca = presenca;
        
    }


    @Override
    public void associarAtividades (Atividade atividade) {

        setAtividade(atividade);
    }

    public void exibirDetalhes() {
        
        System.out.println(this.toString());
    }

    public void exibirAtividades() {

        atividade.exibirDetalhes();
    }


    public boolean permiteAtividadeColetiva() {

        return false;
    }


    public void registrarPresenca(String nomeParticipante) {
        

        
        System.out.println("Presença confirmada para " +nomeParticipante +".");
        this.setPresenca(true);
    }


    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    @Override
    public String toString() {
        return "Basico [presenca=" + presenca + ", getNome()=" + getNome() + ", getValorMensal()=" + getValorMensal()
                + ", getQuantidadeMaximaAtividades()=" + getQuantidadeMaximaAtividades() + ", getStatus()="
                + getStatus() + ", permiteAtividadeColetiva()=" + permiteAtividadeColetiva() + "]";
    }


    public Atividade getAtividade() {
        return atividade;
    }


    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

}
