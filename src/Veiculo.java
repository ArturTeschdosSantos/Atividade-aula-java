public class Veiculo {
    private String marca;
    private String placa;
    private String modelo;
    private String proprietario;
    private String status = "EM_AVALIACAO";

    public Veiculo() {
    }

    public Veiculo(String marca, String placa, String modelo, String proprietario) {
        this(marca, placa, modelo, proprietario, "EM_AVALIACAO");
    }

    public Veiculo(String marca, String placa, String modelo, String proprietario, String status) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.proprietario = proprietario;
        setStatus(status);
    }

    public String getStatus() {
        return status;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProprietario() {
        return proprietario;
    }
    public void setStatus(String status) {
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("O status deve ser informado.");
        }
        this.status = status;
    }
}
