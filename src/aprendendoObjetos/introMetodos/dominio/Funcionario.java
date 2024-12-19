package aprendendoObjetos.introMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public void impressoraDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + this.salario);
    }

    public static void calcularMediaSalario(Double... salarios) {
        double salarioTotal = 0;
        for (Double salario : salarios) {
            salarioTotal += salario;
        }
        System.out.println("A media dos salarios é: " + salarioTotal / salarios.length);
    }

    public void aumentoSalario(Double aumento) {
        this.salario = salario + salario * aumento;

    }

    public void maiorDeIdade() {
        if (this.idade >= 18) {
            System.out.println("O funcionarioi " + this.nome + " é maior de idade");
        } else {
            System.out.println("O funcionarioi " + this.nome + " é menor de idade");
        }
    }

    public static void compDoisSalarios(Double salario1, Double salario2) {
        if (salario1 > salario2) {
            System.out.println("O salario do funcionário 1 é maior que o do funcionário 2");
        } else if (salario1 < salario2) {
            System.out.println("O salario do funcionário 2 é maior que o do funcionário 1");
        } else {
            System.out.println("O sálario dos funcionários é igual");
        }
    }

    public static void totalSalarios(Double... salarios) {
        double salarioTotal = 0.0;
        for (Double salario : salarios) {
            salarioTotal += salario;
        }
        System.out.println("O salario total dos funcionarios é: " + salarioTotal);
    }

    public static void melhorPago(Double... salarios){
        double maiorSal = 0.0;
        for (Double aux : salarios) {
            for (Double aux2 : salarios) {
                if (aux > maiorSal) {
                    maiorSal = aux;
                }
            }
        }
        System.out.println("O funcionario mais bem pago recebe "+maiorSal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
