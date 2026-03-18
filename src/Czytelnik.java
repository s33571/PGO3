public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;
    public Czytelnik(String imie, String nazwisko, int numerKarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0; // Изначально читатель ничего не взял
    }
    public void wypiszDane() {
        System.out.println("Czytelnik: " + imie + " " + nazwisko + " (Karta nr: " + numerKarty + "), wypozyczone ksiazki: " + liczbaWypozyczen);
    }
    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
    }
    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
        } else {
            System.out.println("Ten czytelnik nie ma wypozyczonych ksiazek.");
        }
    }
}
