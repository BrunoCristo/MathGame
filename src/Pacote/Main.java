package Pacote;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Niveis niveis = new Niveis();

        int opcao = 0;

        do {
            System.out.println("*****************");
            System.out.println("* 1 - New Game  *");
            System.out.println("* 2 - Exit      *");
            System.out.println("*****************");
            opcao = in.nextInt();
            if (opcao == 1) {
                if (niveis.level1() == true) {
                    System.out.println("NEXT LEVEL");
                    if (niveis.level2() == true) {
                        System.out.println("NEXT LEVEL");
                        if (niveis.level3() == true) {
                            System.out.println("NEXT LEVEL");
                            if (niveis.level4() == true);
                            System.out.println("GAME COMPLET - CONGRATULATION");
                        }
                    }
                }
            }
        } while (opcao != 2);

    }

}
