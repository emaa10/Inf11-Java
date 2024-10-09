public class GraphMatrix
{
    public int anzahlKnoten;
    public Knoten[] knoten;
    public int[][] matrix;

    public GraphMatrix(int maxAnzahlKnoten)
    {
        anzahlKnoten = 0;
        knoten = new Knoten[maxAnzahlKnoten]; // steht NULL drin
        matrix = new int[maxAnzahlKnoten][maxAnzahlKnoten]; // steht 0 drin

        for(int i = 0; i < maxAnzahlKnoten; i++) {
            for(int j = 0; j < maxAnzahlKnoten; j++) {
                matrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void knotenEinfuegen(String name) {
        //
    }

    public void kanteEinfuegen(String ersterKnoten, String zweiterKnoten, int gewicht) {
        //
    }

    public int knotenNummer(String knotenName) {
        for(int i = 0; i<anzahlKnoten; i++) {
            if(knoten[i].bezeichnerGeben() == knotenName) {
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

}
