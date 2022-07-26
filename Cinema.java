/**
 * usei o javadoc para incluir este comentário.
 */
public class Cinema {
    public String filme;
    private String cadeira;
    private String sala;
    private String preco;
    private String horarioFilme;


    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getHorarioFilme() {
        return horarioFilme;
    }

    public void setHorarioFilme(String horarioFilme) {
        this.horarioFilme = horarioFilme;
    }

    public static void main (String args[]){

        Cinema cinema = new Cinema();
        cinema.setFilme("Filme: Avengers - Ultimate");
        System.out.println(cinema.filme);
        cinema.setSala("Sala: 4");
        System.out.println(cinema.sala);
        cinema.setCadeira("Cadeira: 55");
        System.out.println(cinema.cadeira);
        cinema.setHorarioFilme("Duração: 02:15");
        System.out.println(cinema.horarioFilme);
        cinema.setPreco("Preço: R$ 24");
        System.out.println(cinema.preco);

    }
}
