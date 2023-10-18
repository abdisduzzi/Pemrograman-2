import java.util.Scanner;
public class PRAK105_2210817110005_MIZZUDDINABDISSALAM {
    public static void main(String[] args) {
    Scanner duzz = new Scanner(System.in);
    double phi = 3.14;
    System.out.print("Masukkan jari-jari : ");
    float jari = duzz.nextFloat();
    System.out.print("Masukkan tinggi : ");
    float tinggi = duzz.nextFloat();
    double volume = phi * jari * jari * tinggi;
    System.out.println("Volume tabung adalah dengan jari-jari " + jari + " cm" + " dan tinggi " + tinggi + " cm" + " adalah " + String.format ("%.3f", volume) + " m3");
}
}