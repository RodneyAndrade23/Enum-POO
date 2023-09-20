public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e:EstadoBrasileiro.values()) {
            System.out.print(e.getSigla() + " - " + e.getNome() + " - ");
            System.out.println(e.getIbge());
        }
    }
}
