package aprendendoColecoes.hashcode.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;
    //BigO Colection Java, para ver as coleções em java
    //Sortidas ou Ordenadas
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

    //Regras do hashCode:
    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() não necessariamente y.equals(x) tem q ser true
    // se x.equals(y) == false, y.hashCode() != x.hashCode()
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser false
    @Override
    public int hashCode() {

        return serialNumber == null ? 0: this.serialNumber.hashCode();// Se serial Number == null, retorna 0, se não, retorna o serial number como hashcode
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
