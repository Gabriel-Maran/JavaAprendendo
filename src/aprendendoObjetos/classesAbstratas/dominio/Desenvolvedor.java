package aprendendoObjetos.classesAbstratas.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.15;
    }

    @Override
    public void imprime() { //Obrigatorio (caso a classe pai abstrata não tenha sobre escrito o avo)
                            //pois é a primeira classe concreta dps do pai e vo abstratos
        System.out.println("Impresso");
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
