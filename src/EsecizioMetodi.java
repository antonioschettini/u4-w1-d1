import javax.print.DocFlavor;

public class EsecizioMetodi {
    public static void main(String[] args) {
        // Test metodo moltiplica
        int risultatoMoltiplicazione = moltiplica(4, 5);
        System.out.println("Risultato moltiplicazione è: " + risultatoMoltiplicazione);
        // Test metodo concatena
        String testoUnito = concatena("Anni: ", 32);
        System.out.println("Risultato concatena è: " + testoUnito);
        // Test metodo inserisci in array
        String[] paroleVecchie = {"A", "B", "D", "E", "F"};
        String[] paroleNuove = inserisciInArray(paroleVecchie, "C");
        System.out.println("Nuovo Array di 6 elementi: ");
        for (int i = 0; i < paroleNuove.length; i++) {
            System.out.println(paroleNuove[i] + " ");
        }
        ;
    }

    // Lista Metodi

    // Metodo 1 moltiplica
    public static int moltiplica(int num1, int num2) {
        int prodotto = num1 * num2;
        return prodotto;
    }

    // Metodo 2 concatena
    public static String concatena(String testo, int num) {
        String risultatoUnione = testo + num;
        return risultatoUnione;
    }

    // Metodo 3 inserisci in Array
    public static String[] inserisciInArray(String[] arrayVecchio, String nuovaParola) {
        String[] arrayNuovo = new String[6];
        arrayNuovo[0] = arrayVecchio[0];
        arrayNuovo[1] = arrayVecchio[1];
        arrayNuovo[2] = nuovaParola;
        arrayNuovo[3] = arrayVecchio[2];
        arrayNuovo[4] = arrayVecchio[3];
        arrayNuovo[5] = arrayVecchio[4];
        return arrayNuovo;
    }
}


