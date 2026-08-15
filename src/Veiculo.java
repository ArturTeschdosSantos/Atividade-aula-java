public class Veiculo {
    private String marca;
    private String placa;
    private String modelo;
    private String proprietario;
    private String status = "EM_AVALIACAO";

    public Veiculo(String marca,String placa, String modelo, String proprietario,String status ){
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.status = status;
    }


    public String getStatus() {
        return status;

    }
}


