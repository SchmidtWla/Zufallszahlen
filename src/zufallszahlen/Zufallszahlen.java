package zufallszahlen;

import java.util.concurrent.ThreadLocalRandom;

public class Zufallszahlen {


    int[] zufallszahlArray;

    public int[] getZufallszahlArray() {
        return zufallszahlArray;
    }

    public void setZufallszahlArray(int[] zufallszahlArray) {
        this.zufallszahlArray = zufallszahlArray;
    }

    public Zufallszahlen(int groesseArray) {
        zufallszahlArray = new int[groesseArray];
        fillArray();
    }

    private void fillArray() {
        for (int i = 0; i < this.zufallszahlArray.length; i++) {
            zufallszahlArray[i] = ThreadLocalRandom.current().nextInt(20, 50 + 1);
        }
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < this.zufallszahlArray.length; i++) {
            sum += zufallszahlArray[i];
        }
        return sum;
    }

    public double durchschnitt() {
        return sum() / (double) zufallszahlArray.length;
    }

    public int max() {
        int max = zufallszahlArray[0];
        for (int i = 0; i < this.zufallszahlArray.length; i++) {
            if (zufallszahlArray[i] > max) {
                max = zufallszahlArray[i];
            }
        }
        return max;
    }

    public int min() {
        int min = zufallszahlArray[0];
        for (int i = 0; i < this.zufallszahlArray.length; i++) {
            if (zufallszahlArray[i] < min) {
                min = zufallszahlArray[i];
            }
        }
        return min;
    }

    public int modalWert() { //Was wird bei gleich vielen zurückgegeben.

        int modalWert = 0;
        int maxCount = 0;
        for (int i = 0; i < zufallszahlArray.length; i++) {
            int count = 0;
            for (int j = 0; j < zufallszahlArray.length; j++) {
                if (zufallszahlArray[i] == zufallszahlArray[j]) {
                    count++;
                }
            }
            if (count >= maxCount) {
                maxCount = count;
                modalWert = zufallszahlArray[i];
            }
        }
        return modalWert;
    }


}

