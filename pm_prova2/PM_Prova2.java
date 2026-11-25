/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2;

import java.util.Scanner;

/**
 *
 * @author glbra
 */
public class PM_Prova2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Atividade musculacao = new Musculacao("Musculação", "08:00", 50, 100, 100, StatusAtividade.ATIVA, 30);
        Atividade natacao = new Natacao("Natação", "09:00", 50, 20, 120, StatusAtividade.ATIVA, 3);
        Atividade spinning = new Spinning("Spinning", "10:00", 50, 25, 110, StatusAtividade.ATIVA, 25);

        Plano planoBasico = new Basico("Plano Básico", 100, 1, StatusPlano.ATIVO, false);
        Plano planoPremium = new Premium("Plano Premium", 200, 3, StatusPlano.ATIVO);

        int escolha = 0;

        while (escolha != 8) {

            System.out.println("1. Associar atividades a um plano\r\n" + //
                    "2. Exibir todas as atividades cadastradas\r\n" + //
                    "3. Exibir todos os planos cadastrados\r\n" + //
                    "4. Exibir apenas planos ativos\r\n" + //
                    "5. Emitir certificado para objetos que implementam a interface Certificavel\r\n" + //
                    "6. Registrar presença em atividades que implementam a interface ControladorPresenca\r\n" + //
                    "7. Remover atividades inativas do sistema");

            System.out.println("Digite sua escolha");

            escolha = entrada.nextInt();

            if (escolha == 1) {

                System.out.println("1 - Plano Básico");
                System.out.println("2 - Plano Premium");
                System.out.println("Digite o plano escolhido");

                int plano = entrada.nextInt();

                System.out.println("1 - Musculação");
                System.out.println("2 - Natação");
                System.out.println("3 - Spinning");
                System.out.println("Digite a atividade");

                int atv = entrada.nextInt();

                if (plano == 1) {

                    if (atv == 1) {
                        planoBasico.associarAtividades(musculacao);

                    } else if (atv == 2) {
                        planoBasico.associarAtividades(natacao);
                    }

                    else if (atv == 3) {
                        planoBasico.associarAtividades(spinning);
                    } else {
                        System.out.println("escolha invalida");
                    }
                }

                else if (plano == 2) {

                    if (atv == 1) {
                        planoPremium.associarAtividades(musculacao);

                    } else if (atv == 2) {
                        planoPremium.associarAtividades(natacao);
                    }

                    else if (atv == 3) {
                        planoPremium.associarAtividades(spinning);
                    } else {
                        System.out.println("escolha invalida");
                    }
                }
            }

            else if (escolha == 2) {
                
                System.out.println("1 - Plano Básico");
                System.out.println("2 - Plano Premium");
                System.out.println("Digite o plano escolhido");

                int plano = entrada.nextInt();

                if (plano == 1) {
                    planoBasico.exibirDetalhes();
                }

                else if (plano == 2) {
                    planoPremium.exibirDetalhes();
                }
            }
        }

    }

}
