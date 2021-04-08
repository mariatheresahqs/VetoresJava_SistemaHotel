import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=============================================================================");
        System.out.println("=======================Hello to the World Hotel!=============================");
        Scanner sc = new Scanner(System.in);
        int qntHospedes;
        int qntQuartos = 10; // Hotel com capacidade maxima de 10 quartos
        Quarto[] quartos = new Quarto[qntQuartos];
        Controller_Hospede_Quarto control = new Controller_Hospede_Quarto();

        // Inicando propriedades dos quartos
        control.alocarQuartos(quartos);
        control.iniciarQuartos(quartos);


        System.out.print("Digite quantos quartos serão alugados:");
        qntHospedes = sc.nextInt();
        while(qntHospedes>qntQuartos || qntHospedes<0){
            System.out.println("Desculpe, mas temos apenas 10 quartos disponíveis.");
            System.out.print("Quantos desses quartos você deseja alugar?  ");
            qntHospedes = sc.nextInt();
        }
        if(qntHospedes !=0){
            Hospede[] hospedes = new Hospede[qntHospedes];
            String nome, email;
            control.alocarHospedes(hospedes);
            sc.nextLine();
            System.out.println("CADASTRO DE HOSPEDES:");
            for (int i = 0; i < hospedes.length; i++) {
                System.out.printf("Quarto #%d: ", i);
                System.out.print("\nDigite o nome do hospede: ");
                nome = sc.nextLine();
                // sc.nextLine();
                System.out.print("Digite o e-mail do hospede: ");
                email = sc.nextLine();
                control.checkinHospedeQuarto(hospedes, quartos, nome, email, i);  
            }
            System.out.println("====================================================");

            System.out.println("\nLista de hospedes: \n");
            control.mostrarHospedes(hospedes);
            System.out.println("====================================================");
            
            System.out.println("\nLista de quartos ocupados: \n");
            control.mostrarQuartosOcupados(quartos);
            System.out.println("====================================================");

            System.out.println("\nLista de todos os quartos: \n");
            control.mostrarQuartos(quartos);
            System.out.println("====================================================");
        }
        
        System.out.println("Esperamos poder atendê-lo em outra oportunidade.");
        System.out.println("====================================================");
        System.out.println("====================================================");
        

        sc.close();
    }

}
