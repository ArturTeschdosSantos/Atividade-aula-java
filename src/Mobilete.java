public class Mobilete extends Veiculo{
    private String bateria;

    public Mobilete (String marca, String placa, String modelo, String proprietario, String status){
        super (marca, placa, modelo,proprietario,status);


        if (cilindradas < 0) {
            throw new IllegalArgumentException("A cilindrada não pode ser negativa.");
        }
        this.bateria = bateria;
    }

}
