public class ExceptionStack {

    public static int division(int x, int y){
        try {
            return x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Division par 0 ici");
            
            e.printStackTrace();
            
            return 0;
        }
    }

    public static void calcul(int x) {
        System.out.println("Fonction calcul()");
        int resultat = division(x, 0);
        System.out.println("Fin fonction de calcul()\nRésultat: " + resultat);
    }

    public static void main(String[] args) {
        System.out.println("Fonction main");
        calcul(25);
        System.out.println("Exception gérée, Suite du programme...");
    }
}
