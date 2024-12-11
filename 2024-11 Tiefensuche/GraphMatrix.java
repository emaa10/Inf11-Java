public class GraphMatrix
{
    public int anzahlKnoten;
    public Knoten[] knoten;
    public int[][] matrix;
    public boolean[] besucht;

    public GraphMatrix(int maxAnzahlKnoten)
    {
        anzahlKnoten = 0;
        knoten = new Knoten[maxAnzahlKnoten]; // steht NULL drin
        matrix = new int[maxAnzahlKnoten][maxAnzahlKnoten]; // steht 0 drin
        besucht = new boolean[maxAnzahlKnoten];

        for(int i = 0; i < maxAnzahlKnoten; i++) {
            for(int j = 0; j < maxAnzahlKnoten; j++) {
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void knotenEinfuegen(String name) {
        if(anzahlKnoten < knoten.length && knotenNummer(name) == -1) { // wenn anzahlKnoten kleiner als knoten länge und kein Element den Bezeichner schon hat
            knoten[anzahlKnoten] = new Knoten(name);
            anzahlKnoten += 1;
        }
    }

    public void kanteEinfuegen(String ersterKnoten, String zweiterKnoten, int gewicht) {
        //
    }

    public int knotenNummer(String query) {
        for(int i = 0; i<anzahlKnoten; i++) {
            if(knoten[i].bezeichnerGeben().equals(query)) {
                return i;
            }
        } 
        return -1;
    }

    public void ausgeben() {
        //
    }

    public int knotenAnzahlGeben() {
        return 0;
    }

    public int kantenGewichtGeben() {
        return 0;
    }

    public void tiefensuche(String startKnoten) {
        int startNummer = knotenNummer(startKnoten);

        if(startNummer != -1) { // wenn der knoten existiert
            //alle knoten als nicht besucht initialisieren
            for(int i = 0; i < anzahlKnoten; i++) {
                besucht[i] = false;
            }

            besuchen(startNummer);
        }
    }

    public void besuchen(int knotenNummer) {
        // Step 1 - aktuellen Knoten als besucht markieren und den Bezeichner ausgeben
        besucht[knotenNummer] = true;
        System.out.println(knoten[knotenNummer].bezeichnerGeben() + "; ");

        // Step 2 - Mit der Matrix schauen, ob der aktuelle Knoten mit anderen Knoten verbunden ist (über Kanten)
        for(int abzweigNummer = 0; abzweigNummer < anzahlKnoten; abzweigNummer++) {
            // Step 3 - Falls es eine Kante gibt und der Zielknoten nicht besucht wrude, dort weiterarbeiten
            if((matrix[knotenNummer][abzweigNummer] > Integer.MIN_VALUE) && besucht[abzweigNummer] == false) {
                besuchen(abzweigNummer);
            }
        }
        System.out.println(knoten[knotenNummer].bezeichnerGeben() + " abgeschlossen;");
    }

}
