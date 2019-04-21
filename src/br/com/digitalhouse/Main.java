package br.com.digitalhouse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Funcionarios> pessoas = new ArrayList<>();

        String resposta;
        int numeroTmp = 0;
        Random random;

        System.out.println("Deseja cadastrar um funcionario? \n" +
                "Digite 1)SIM  |  2)NÃO ");
        Scanner teclado = new Scanner(System.in);
        String sim = "1";
        resposta = teclado.nextLine();
        if (resposta.equals(sim)) {
            System.out.println("Digita o nome do funcionario (1) aqui: ");
            String nP1 = teclado.nextLine();

            random = new Random();
            for (int i = 0; i < 10; i++) {
                numeroTmp = random.nextInt(30);
            }
            Integer num1 = numeroTmp;
            Funcionarios f1 = new Funcionarios(nP1, num1);
            pessoas.add(f1);
            System.out.println("Funcionario Cadastrado com sucesso!\n" +
                    pessoas);
            System.out.println("Deseja cadastrar mais alguem?\n" +
                    "Digite 1)SIM   |   2)NÃO");
            resposta = teclado.nextLine();
            if (resposta.equals(sim)) {
                System.out.println("Digita o nome do funcionario (1) aqui: ");
                String nP2 = teclado.nextLine();

                random = new Random();
                for (int i = 0; i < 10; i++) {
                    numeroTmp = random.nextInt(30);
                }
                Integer num2 = numeroTmp;
                Funcionarios f2 = new Funcionarios(nP2, num2);
                pessoas.add(f2);
                System.out.println("Funcionario Cadastrado com sucesso!\n" +
                        pessoas);
                System.out.println("Deseja cadastrar mais alguem?\n" +
                        "Digite 1)SIM   |   2)NÃO");
                resposta = teclado.nextLine();

            } else {
                System.out.println("Nenhun funcionario foi cadastrado!\n" +
                        "Pode fechar a janela!\n" +
                        "Obrigado por utilizar o nosso sistema!");
            }

        }


    }
}


        /*int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto:");
        while (sc.hasNext()) {
            i++;
            System.out.println("Token: " + sc.next());
        }
        sc.close(); //Encerra o programa*/

