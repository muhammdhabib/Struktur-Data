package StrukturData.Modul1;

import java.util.Scanner;

public class Segitiga<T extends Number> {
    private final T Alas; private final T Tinggi;

    public Segitiga(T Alas, T Tinggi) {
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }

    public int getResultAsInt() {
        return (int) ((Alas.doubleValue() * Tinggi.doubleValue()) / 2);
    }

    public double getResultAsDouble() {
        return (Alas.doubleValue() * Tinggi.doubleValue()) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai Alas: ");
        int Alas = scanner.nextInt();
        System.out.print("Masukkan Nilai tinggi: ");
        int Tinggi = scanner.nextInt();

        Segitiga<Integer> segitiga = new Segitiga<>(Alas, Tinggi);

        System.out.print("Menampilkan Luas Segitiga dalam Integer atau Double? ");
        System.out.print("\n(Ketik 'int' atau 'double') : ");
        String choice = scanner.next();

        if (choice.equals("int")) {
            int areaInt = segitiga.getResultAsInt();
            System.out.println("Luas Segitiga dalam Integer: " + areaInt);
        } else if (choice.equals("double")) {
           double areaDouble = segitiga.getResultAsDouble();
            System.out.println("Luas Segitiga dalam Double : " + areaDouble);
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}