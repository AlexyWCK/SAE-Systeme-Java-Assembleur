public class exo1PileEnJava {
    public static void main(String[] args) {
        etape1();  // Appel de etape1
    }

    public static void etape1() {
        etape2();  // Appel de etape2
        System.out.println("Je retourne à l'étape 1");
    }

    public static void etape2() {
        System.out.println("Je suis à l'étape 2");
    }
}

// La méthode main() appelle etape1().

// La pile d'appels ajoute main() et ensuite etape1().

// On appelle etape2() dans etape1(), ce qui ajoute etape2() dans la pile.

// Une fois la methode etape2() terminée, elle est retirée de la pile et on revient dans la méthode etape1()".

// Enfin, lorsque etape1() est terminée aussi, elle est retirée de la pile et l'exécution se termine.
