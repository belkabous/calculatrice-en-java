import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static double a,b;
     static void printMenu() {
        System.out.print("Calculatrice: \n1 - addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Puissance\n6 - Racine Carrée\n7 - Factorielle\n0 - Quitter");
        System.out.print("\nchoisir :");

    }








     static void operation1() {
        System.out.println("entrer la première valeur: ");
        a = sc.nextDouble();
        System.out.println("entrer la deuxième valeur: ");
        b = sc.nextDouble();
        System.out.println("la somme: " + (a+b));
    }

    static void operation2() {
        System.out.println("entrer la première valeur: ");
        a = sc.nextDouble();
        System.out.println("entrer la deuxième valeur: ");
        b = sc.nextDouble();

        System.out.println("la différence: " + (a-b));
    }

    static void operation3() {
        System.out.println("entrer la première valeur: ");
        a = sc.nextDouble();
        System.out.println("entrer la deuxième valeur: ");
        b = sc.nextDouble();
        System.out.println("le produit: " + (a*b));
    }

    static void operation4() {
        System.out.println("entrer la première valeur: ");
        a = sc.nextDouble();
        System.out.println("entrer la deuxième valeur: ");
        b = sc.nextDouble();
        if (b == 0) {
            System.out.println("ereur");
            return;

        }
            System.out.println("la quotient: " + (a/b));

    }

    static void operation5() {
        System.out.println("entrer la base: ");
        a = sc.nextDouble();
        System.out.println("entrer l'exposant: ");
        b = sc.nextDouble();
        System.out.println("la puissance: " + Math.pow(a, b));
    }

    static void operation6() {
        System.out.println("entrer la valeur: ");
        a = sc.nextDouble();
        System.out.println("la racine carrée: " + Math.sqrt(a));
    }

    static void operation7() {
        System.out.println("entrer la valeur: ");
        a = sc.nextDouble();

        if (a < 0) {
            System.out.println("Erreur");
        } else {
            int factorielle = 1;
            for (int i = 1; i <= a; i++) {
                factorielle *= i;

            }
            System.out.println("Factorielle : " + factorielle);
        }
    }







    public static void main (String[] args){

        int choix;




        while (true) {
            printMenu();
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                     operation1();
                    break;
                case 2:
                    operation2();
                    break;
                case 3:
                    operation3();
                    break;
                case 4:
                    operation4();
                    break;
                case 5:
                    operation5();
                    break;
                case 6:
                    operation6();
                    break;
                case 7:
                    operation7();
                    break;
                case 0:
                    return;


                default:
                    System.out.println("non valide");

            }
        }


    }
}