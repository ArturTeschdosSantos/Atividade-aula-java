
public class Moto extends Veiculo {
    private final int cilindradas;

    public Moto(String marca, String placa, String modelo, String proprietario, String status) {
        this(marca, placa, modelo, proprietario, status, 0);
    }

    public Moto(String marca, String placa, String modelo, String proprietario, String status, int cilindradas) {
        super(marca, placa, modelo, proprietario, status);

        if (cilindradas < 0) {
            throw new IllegalArgumentException("A cilindrada não pode ser negativa.");
        }

        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
