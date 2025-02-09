public class DebugStack{

    public static int convertToNumber(String texte) {
        return Integer.parseInt(texte);
    }

    public static void afficherResultat(String valeur) {
        int nombre = convertToNumber(valeur);
        System.out.println("Conversion réussie : " + nombre);
    }

    public static void main(String[] args) {
        try {
            afficherResultat("98P");  //erreur ici car la chaîne de caracère contient une lettre
        } catch (NumberFormatException e) {
            System.out.println("Erreur : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Suite du programme...");
    }
}
