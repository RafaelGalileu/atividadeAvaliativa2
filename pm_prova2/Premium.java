package pm_prova2;

import java.util.ArrayList;

public class Premium extends Plano{

    private ArrayList<Atividade> atividades;

    public Premium(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status) {
        super(nome, valorMensal, quantidadeMaximaAtividades, status);

        this.atividades = new ArrayList<>();
    }

    @Override
    public void associarAtividades (Atividade atividade) {

        atividades.add(atividade);
    }

    public void exibirDetalhes() {
        System.out.println(this.toString());
    }

    public boolean permiteAtividadeColetiva() {
        return true;
    }

    @Override
    public String toString() {
        return "Premium [getNome()=" + getNome() + ", getValorMensal()=" + getValorMensal()
                + ", getQuantidadeMaximaAtividades()=" + getQuantidadeMaximaAtividades() + ", getStatus()="
                + getStatus() + ", permiteAtividadeColetiva()=" + permiteAtividadeColetiva() + "]";
    }

    

    

    

}
