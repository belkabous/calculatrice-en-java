import java.util.Scanner;

public class Main {

    static void printMenu() {
        System.out.println("Calculatrice: \n" +
                "1 - addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Puissance\n6 - Racine Carrée\n7 - Factorielle\n0 - Quitter");
        System.out.print("choisir :");

    }

    static void operation1(int a, int b) {
        int total = a + b;
        System.out.println("la somme: " + total);
    }

    static void operation2(int a, int b) {
        int total = a - b;
        System.out.println("la différence: " + total);
    }

    static void operation3(int a, int b) {
        int total = a * b;
        System.out.println("le produit: " + total);
    }

    static void operation4(int a, int b) {
        if (b == 0) {
            System.out.println("ereur");
        } else {
            int total = a / b;
            System.out.println("la quotient: " + total);
        }
    }

    static void operation5(int a, int b) {
        int total = (int) Math.pow(a, b);
        System.out.println("la puissance: " + total);
    }

    static void operation6(int a, int b) {

        Scanner ch = new Scanner(System.in);
        System.out.println("si tu veux le première nombre entrer 1 ou enter 2");
        int choix = ch.nextInt();
        if (choix == 1) {
            int total = (int) Math.sqrt(a);
            System.out.println("la racine carrée: " + total);
        } else if (choix == 2) {
            int total2 = (int) Math.sqrt(b);
            System.out.println("la racine carrée: " + total2);
        } else {
            System.out.println("invalide");
        }

    }

    static void operation7(int a, int b) {

        if (a <= 0) {
            System.out.println("Erreur");
        } else {
            long factorielle = 1;
            for (int i = 1; i <= a; i++) {
                factorielle *= i;


                System.out.println("Factorielle 1:" + factorielle);


            }
        }
    }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b, choix;


        System.out.println("entrer la première valeur: ");
        a = sc.nextInt();

        System.out.println("entrer la deuxième valeur: ");
        b = sc.nextInt();


        while (true) {
            printMenu();
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    operation1(a, b);
                    break;
                case 2:
                    operation2(a, b);
                    break;
                case 3:
                    operation3(a, b);
                    break;
                case 4:
                    operation4(a, b);
                    break;
                case 5:
                    operation5(a, b);
                    break;
                case 6:
                    operation6(a, b);
                    break;
                case 7:
                    operation7(a, b);
                    break;
                case 0:
                    return;

                default:
                    System.out.println("non valide");

            }
        }


    }

}