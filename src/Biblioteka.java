public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;
    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano ksiazke: " + ksiazka.getTytul());
        } else {
            System.out.println("Brak miejsca w bibliotece na ksiazke: " + ksiazka.getTytul());
        }
    }
    public void wypiszDostepneKsiazki() {
        System.out.println("Dostepne ksiazki w bibliotece");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }
    public void znajdzKsiazkePoTytule(String tytul) {
        boolean znaleziona = false;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                System.out.println("Znaleziono ksiazke:");
                ksiazki[i].wypiszInfo();
                znaleziona = true;
                break;
            }
        }
        if (!znaleziona) {
            System.out.println("Nie znaleziono ksiazki o tytule: " + tytul);
        }
    }
    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        return licznik;
    }
    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                if (ksiazki[i].isDostepna()) {
                    ksiazki[i].wypozycz();
                    czytelnik.zwiekszLiczbeWypozyczen();
                    System.out.println("Operacja udana: Czytelnik wypozyczyl ksiazke.");
                } else {
                    System.out.println("Blad: Ksiazka jest juz wypozyczona.");
                }
                return;
            }
        }
        System.out.println("Nie znaleziono ksiazki w bibliotece.");
    }
    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                if (!ksiazki[i].isDostepna()) {
                    ksiazki[i].zwroc();
                    czytelnik.zmniejszLiczbeWypozyczen();
                    System.out.println("Operacja udana: Czytelnik zwrocil ksiazke.");
                } else {
                    System.out.println("Blad: Ta ksiazka nie byla wypozyczona.");
                }
                return;
            }
        }
        System.out.println("Nie znaleziono ksiazki w bibliotece.");
    }
}