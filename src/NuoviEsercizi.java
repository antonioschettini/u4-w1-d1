import java.util.Scanner;

public class NuoviEsercizi {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // Esercizio 2 sulle Stringhe
        System.out.println("Esercizio 2");
        System.out.println("Inserisci la prima parola");
        String s1 = tastiera.nextLine();
        System.out.println("Inserisci la seconda parola");
        String s2 = tastiera.nextLine();
        System.out.println("Inserisci la terza parola");
        String s3 = tastiera.nextLine();
        String ordinaParole = s1 + " " + s2 + " " + s3;
        String ordinaParoleInverso = s3 + " " + s2 + " " + s1;
        System.out.println("Ordine Normale: " + ordinaParole);
        System.out.println("Ordine Inverso: " + ordinaParoleInverso);

        // Esercizio 2.1 Pari e Dispari
        System.out.println("Inserisci un numero intero da controllare");
        int numeroIntero = tastiera.nextInt();
        int controlloPari = pariDispari(numeroIntero);
        System.out.println("Risultato (0=pari, 1= dispari): " + controlloPari);

        // Esercizio 3 sul Rettangolo
        System.out.println("Inserisci i 3 lati di un rettangolo:");
        System.out.println("Lato 1 : ");
        double lato1 = tastiera.nextDouble();
        System.out.println("Lato 2 : ");
        double lato2 = tastiera.nextDouble();
        System.out.println("Lato 3 : ");
        double lato3 = tastiera.nextDouble();
        double areaTriangolo = perimetroTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo (Formula Erone) è: " + areaTriangolo);

        tastiera.close();
    }

    // Costruttore Metodi per il Triangolo

    // Metodo per il perimetro Triangolo
    public static double perimetroTriangolo(double lato1, double lato2) {
        return (lato1 + lato2) * 2;
    }

    // Metodo pari e dispari
    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Metodo per l'area e perimetro del triangolo
    public static double perimetroTriangolo(double a, double b, double c) {
        // Calcoliamo il semiperimetro (la metà della somma dei lati
        double semiPerimetro = (a + b + c) / 2;
        // Applichiamo la formula di Erone. Math.sqrt serve a fare la Radice Quadrata
        return Math.sqrt(semiPerimetro * (semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c));
    }

}
