package Pacote;

import java.util.Scanner;

public class Niveis {

    Scanner in = new Scanner(System.in);

    boolean continua = true;
    String coracao;
    String operador = null;
    int vidas = 3;
    int points = 0;
    int number1;
    int number2;
    int operation;
    int resultPC;
    int resultUser;

    public boolean level1() {

        for (int i = 0; i < 10; i++) {

            if (vidas == 1) {
                coracao = "<3";
            } else if (vidas == 2) {
                coracao = "<3 <3";
            } else {
                coracao = "<3 <3 <3";
            }

            number1 = (int) (Math.random() * 9);
            number2 = (int) (Math.random() * 9);
            operation = (int) (Math.random() * 2);

            if (operation == 1) {
                operador = "+";
                resultPC = number1 + number2;
            } else {
                operador = "-";
                resultPC = number1 - number2;
            }

            System.out.println("Conta " + (i + 1) + " | Vidas " + coracao + " | Pontuação " + points + "\n");

            System.out.print(number1 + " " + operador + " " + number2 + " = ");
            resultUser = in.nextInt();

            if (resultPC == resultUser) {
                System.out.println("Certa Resposta\n");
                points = points + 10;
            } else {
                System.out.println("Errrooouu\n");
                vidas = vidas - 1; // vidas = vidas - 1
            }

            if (vidas == 0) {
                System.out.println("GAME OVER");
                continua = false;
                break;
            }

        }
        return continua; // Se acertou tudo continua = true se perdeu todas vidas continua = false
    }

    public boolean level2() {
        for (int i = 0; i < 10; i++) {

            if (vidas == 1) {
                coracao = "<3";
            } else if (vidas == 2) {
                coracao = "<3 <3";
            } else {
                coracao = "<3 <3 <3";
            }

            number1 = (int) (Math.random() * 9);
            number2 = (int) (Math.random() * 9);

            operador = "*";
            resultPC = number1 * number2;

            System.out.println("Conta " + (i + 1) + " | Vidas " + coracao + " | Pontuação " + points + "\n");

            System.out.print(number1 + " " + operador + " " + number2 + " = ");
            resultUser = in.nextInt();

            if (resultPC == resultUser) {
                System.out.println("Certa Resposta\n");
                points = points + 10;
            } else {
                System.out.println("Errrooouu\n");
                vidas = vidas - 1; // vidas = vidas - 1
            }

            if (vidas == 0) {
                System.out.println("GAME OVER");
                continua = false;
                break;
            }

        }
        return continua; // Se acertou tudo continua = true se perdeu todas vidas continua = false
    }

    public boolean level3() {
        for (int i = 0; i < 10; i++) {

            if (vidas == 1) {
                coracao = "<3";
            } else if (vidas == 2) {
                coracao = "<3 <3";
            } else {
                coracao = "<3 <3 <3";
            }

            number1 = (int) (Math.random() * 9);
            number2 = (int) (Math.random() * 9);

            String operador;
            operador = "/";
            resultPC = number1 / number2;

            System.out.println("Conta " + (i + 1) + " | Vidas " + coracao + " | Pontuação " + points + "\n");

            System.out.print(number1 + " " + operador + " " + number2 + " = ");
            resultUser = in.nextInt();

            if (resultPC == resultUser) {
                System.out.println("Certa Resposta\n");
                points = points + 10;
            } else {
                System.out.println("Errrooouu\n");
                vidas = vidas - 1; // vidas = vidas - 1
            }

            if (vidas == 0) {
                System.out.println("GAME OVER");
                continua = false;
                break;
            }

        }
        return continua; // Se acertou tudo continua = true se perdeu todas vidas continua = false    
    }

    public boolean level4() {

        for (int i = 0; i < 10; i++) {

            if (vidas == 1) {
                coracao = "<3";
            } else if (vidas == 2) {
                coracao = "<3 <3";
            } else {
                coracao = "<3 <3 <3";
            }

            number1 = (int) (Math.random() * 99);
            number2 = (int) (Math.random() * 99);
            operation = (int) (Math.random() * 4);

            if (operation == 1) {
                operador = "+";
                resultPC = number1 + number2;
            } else if (operation == 2) {
                operador = "-";
                resultPC = number1 - number2;
            } else if (operation == 3) {
                operador = "*";
                resultPC = number1 * number2;
            } else {
                operador = "/";
                resultPC = number1 / number2;
            }

            System.out.println("Conta " + (i + 1) + " | Vidas " + coracao + " | Pontuação " + points + "\n");

            System.out.print(number1 + " " + operador + " " + number2 + " = ");
            resultUser = in.nextInt();

            if (resultPC == resultUser) {
                System.out.println("Certa Resposta\n");
                points = points + 10;
            } else {
                System.out.println("Errrooouu\n");
                vidas = vidas - 1; // vidas = vidas - 1
            }

            if (vidas == 0) {
                System.out.println("GAME OVER");
                continua = false;
                break;
            }

        }
        return continua; // Se acertou tudo continua = true se perdeu todas vidas continua = false
    }
}
