public class Quarto {
    int numero;
    boolean ocupacao;

    /*
    *   CONSTRUTORES
    */
    public Quarto(){}

    public Quarto(int numero) {
        this.numero = numero;
    }

    public Quarto(int numero, boolean ocupacao) {
        this.numero = numero;
        this.ocupacao = ocupacao;
    }

    /*
    *   SETTERS
    */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOcupacao(boolean ocupacao) {
        this.ocupacao = ocupacao;
    }

    /*
    *   GETTERS
    */
    public int getNumero() {
        return numero;
    }

    public boolean getOcupacao() {
        return ocupacao;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + ", ocupação: " + ocupacao + "";
    }
        
}
