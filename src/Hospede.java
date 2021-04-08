public class Hospede {
    String nome;
    String email;
    int quarto;

    /*
    *   CONSTRUTORES
    */
    public Hospede() {
    }

    public Hospede(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    /*
    *   SETTERS
    */
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    /*
    *   GETTERS
    */
    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public int getQuarto() {
        return quarto;
    }

    @Override
    public String toString() {
        return "Quarto #" + quarto + ":\n" + "Nome:" + nome + ", email: " + email + "";
    }

}
