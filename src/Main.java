import ordenacao.OrdenacaoFactory;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tipo de ordenação desejada?");
        System.out.println("[0] - Crescente");
        System.out.println("[1] - Decrescente");
        System.out.println("[2] - Aleatório");

        Integer tipo = scanner.nextInt();

        System.out.println("Digite quantos números quer ordenar: ");

        OrdenacaoFactory
                .getOrdenacao(tipo)
                .Ordenar(
                        IntStream
                                .range(0, scanner.nextInt())
                                .map((i) -> {
                                    System.out.println("Digite um número: ");
                                    return scanner.nextInt();
                                })
                                .boxed()
                                .collect(Collectors.toList()))
                .stream()
                .forEach(System.out::println);

    }
}
