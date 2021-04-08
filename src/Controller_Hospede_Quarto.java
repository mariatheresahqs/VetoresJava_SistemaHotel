public class Controller_Hospede_Quarto {

    /************************
     * QUARTOS
     ***********************/

    public void alocarQuartos(Quarto[] quartos){
        for (int i = 0; i < quartos.length; i++) {
            quartos[i] = new Quarto();
        }
    }

    public void iniciarQuartos(Quarto[] quartos){
        for (int i = 0; i < quartos.length; i++) {
            quartos[i].setNumero(i);
            quartos[i].setOcupacao(false);
        }
    }

    public void mostrarQuartos(Quarto[] quartos){
        for (int i = 0; i < quartos.length; i++) {
            System.out.println(quartos[i].toString());
        }
    }

    public void mostrarQuartosOcupados(Quarto[] quartos){
        for (int i = 0; i < quartos.length; i++) {
            if(quartos[i].ocupacao != false)
                System.out.println(quartos[i].toString());
        }
    }

    /************************
     * HOSPEDES
     ***********************/
    public void alocarHospedes(Hospede[] hospedes){
        for (int i = 0; i < hospedes.length; i++) {
            hospedes[i] = new Hospede();
        }
    }

    // public void iniciarHospedes(Hospede[] hospedes){
    //     for (int i = 0; i < hospedes.length; i++) {
    //         hospedes[i].setNome;
    //         hospedes[i].setEmail;
    //     }
    // }

    public void mostrarHospedes(Hospede[] hospedes){
        for (int i = 0; i < hospedes.length; i++) {
            System.out.println(hospedes[i].toString());
        }
    }


    /************************
     * QUARTOS - HOSPEDES
     ***********************/
    public void checkinHospedeQuarto(Hospede[] hospedes, Quarto[] quartos, String nome, String email, int i){
        hospedes[i].setNome(nome);
        hospedes[i].setEmail(email);
        hospedes[i].setQuarto(i);
        quartos[i].setNumero(i);
        quartos[i].setOcupacao(true);
    }
}
