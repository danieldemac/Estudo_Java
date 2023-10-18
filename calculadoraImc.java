import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadoraImc {
    private static final double MAGREZA_GRAVE = 16.0;
    private static final double MAGREZA_MODERADA = 17.0;
    private static final double MAGREZA_LEVE = 18.5;
    private static final double NORMAL = 24.9;
    private static final double SOBREPESO = 30.0;
    private static final double OBESIDADE_GRAU_I = 35.0;
    private static final double OBESIDADE_GRAU_II = 40.0;
    private static final DecimalFormat format = new DecimalFormat("###,###.##");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-|--|--|--|--|--|--|--|--|-");
        System.out.println("Calculadora IMC - By Daniel Cabral");
        System.out.println("-|--|--|--|--|--|--|--|--|-");
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua altura em metros: ");
        double altura = scan.nextDouble();

        System.out.println("Digite seu peso em Kg: ");
        double peso = scan.nextDouble();

        double imc = calcularIMC(peso, altura);
        exibirResultadoIMC(nome, imc);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void exibirResultadoIMC(String nome, double imc) {
        System.out.print(nome + ", o seu IMC é de: " + format.format(imc) + " ----> ");

        if (imc < MAGREZA_GRAVE) {
            System.out.print("Magreza grave");
            System.out.println();
            System.out.println("RECOMENDAÇÃO DE NUTRICIONISTA");
        } else if (imc < MAGREZA_MODERADA) {
            System.out.print("Magreza moderada");
            System.out.println();
            System.out.println("RECOMENDAÇÃO DE NUTRICIONISTA");
        } else if (imc < MAGREZA_LEVE) {
            System.out.print("Magreza leve");
        } else if (imc < NORMAL) {
            System.out.print("Normal");
        } else if (imc < SOBREPESO) {
            System.out.print("Sobrepeso");
            System.out.println();
            System.out.println("RECOMENDAÇÃO DE NUTRICIONISTA");
        } else if (imc < OBESIDADE_GRAU_I) {
            System.out.print("Obesidade GRAU I");
            System.out.println();
            System.out.println("RECOMENDAÇÃO DE NUTRICIONISTA");
        } else if (imc < OBESIDADE_GRAU_II) {
            System.out.print("Obesidade GRAU II");
            System.out.println();
            System.out.println("RECOMENDAÇÃO DE NUTRICIONISTA");
        } else {
            System.out.print("Obesidade GRAU III");
            System.out.println();
            System.out.println("RECOMENDAÇÃO DE NUTRICIONISTA");
        }
    }
}