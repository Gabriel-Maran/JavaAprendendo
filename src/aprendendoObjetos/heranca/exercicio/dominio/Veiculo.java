package aprendendoObjetos.heranca.exercicio.dominio;

public class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Veiculo(String marca, String modelo, String placa) {
        this(marca,modelo);
        this.placa = placa;
    }

    public void imprime() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        if (placa == null) {System.out.println("Placa: sem placa"); return;}
        System.out.println("Placa: " + placa);
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
