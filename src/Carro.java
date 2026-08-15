public class Carro extends Veiculo{
    private int cavalos;

    public Carro(String marca, String placa, String modelo, String proprietario, String status) {
        super(marca, placa, modelo, proprietario, status);
    }

    Carro carro1 = new Carro("renault","87980","kwid","nathalia","EM_AVALIACAO");
    Carro carro2 = new Carro("Honda", "ISI5A51", "Civic","Eliseu","EM_MANUTENCAO");
}
