public class GraphMatrix
{
    public int anzahlKnoten;
    public Knoten[] knoten;
    public int[][] matrix;

    public GraphMatrix(int anzahlKnotenN)
    {
        anzahlKnoten = anzahlKnotenN;
        knoten = new Knoten[anzahlKnotenN];
        matrix = new int[anzahlKnoten][anzahlKnoten];
    }

    public void knotenEinfuegen(String name) {
        //
    }

    public void kanteEinfuegen(String ersterKnoten, String zweiterKnoten, int gewicht) {
        //
    }

    public int knotenNummer(String knoten) {
        return 0;
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
