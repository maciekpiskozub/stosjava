import java.util.Arrays;

public class Stos {
    private double[] tablica;
    private int pierwszy;

    public Stos(int rozmiar){
        tablica = new double[rozmiar];
        pierwszy = 0;
    }

    public boolean isEmpty(){
        if(pierwszy == 0){
            return true;
        } else {
            return false;
        }
    }

    public void push(double zawartosc){
        tablica[pierwszy] = zawartosc;
        pierwszy++;

    }

    public double pop(){
        double zwraca = tablica[pierwszy-1];
        pierwszy--;
        return zwraca;
    }

    public double top(){
        return tablica[pierwszy-1];
    }

}
