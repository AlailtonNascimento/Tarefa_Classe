/**
 * usei o javadoc para incluir este comentário.
 */
public class TicketDoCinema {
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

        TicketDoCinema ticketDoCinema = new TicketDoCinema();
        ticketDoCinema.setFilme("Filme: Avengers - Ultimate");
        System.out.println(ticketDoCinema.filme);
        ticketDoCinema.setSala("Sala: 4");
        System.out.println(ticketDoCinema.sala);
        ticketDoCinema.setCadeira("Cadeira: 55");
        System.out.println(ticketDoCinema.cadeira);
        ticketDoCinema.setHorarioFilme("Hora: 20:15");
        System.out.println(ticketDoCinema.horarioFilme);
        ticketDoCinema.setPreco("Preço: R$ 24");
        System.out.println(ticketDoCinema.preco);

    }
}
