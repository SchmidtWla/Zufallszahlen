package zufallszahlen;

public class Main {
    public static void main(String[] args) {
        Zufallszahlen zahlen = new Zufallszahlen(5);
        for(Integer zahl : zahlen.getZufallszahlArray()) {
            System.out.println(zahl);
        }
        System.out.println("Summe: " + zahlen.sum());
        System.out.println("Durchschnitt: " + +zahlen.durchschnitt());
        System.out.println("Minimum: " + zahlen.min());
        System.out.println("Maximum: " + zahlen.max());
        System.out.println("Modal Wert: " + zahlen.modalWert());
    }
}

