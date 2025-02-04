package aprendendoColecoes.equals.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    //Regras do equal:
    //1- Reflexivo : x.equals(x) tem que ser true, a menos que x = null
    //2- Simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == truw
    //3- Transitividade: para x,y,z, diferentes de null, se x.equals(y) == true e x.equals(z) == true, então z.equals(y) == true
    //4- Consistente: x.equals(x) sempre se retorna true, se x != null
    // para x diferente de null, x.equals(null) == false
    @Override
    public boolean equals(Object obj) { //Levar em consideração a regra de negocio para retornar o que é true e o que é falso
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.getSerialNumber());
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
}
