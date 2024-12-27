package aprendendoObjetos.heranca.dominio;

public class Funcionario extends Pessoa { //só pode extender uma classe
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome); //pega a variavel 'nome' de Pessoa, so que extendida para o Funcionario, modificando o nome do Objeto Funcionario
        System.out.println("Dentro do contrtutor de Funcionario");
    }

    public void imprime() {
        super.imprime(); //Se refere a classe mais generica(Classe pessoa) e realiza o que está la, so que aplicado nesta classe(Classe Funcionario)
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
