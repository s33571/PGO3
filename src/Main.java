public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Andrzej Sapkowski", 320, true);
        Ksiazka k2 = new Ksiazka("Solaris", "Stanislaw Lem", 250, true);
        Ksiazka k3 = new Ksiazka("Lalka", "Boleslaw Prus", 680, false);
        System.out.println("Ksiazki w bibliotece:");
        k1.wypiszInfo();
        k2.wypiszInfo();
        k3.wypiszInfo();
        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1001);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 1002);
        System.out.println("Czytelnicy:");
        c1.wypiszDane();
        c2.wypiszDane();
        System.out.println("Testujemy metody czytelnika:");
        c1.zwiekszLiczbeWypozyczen();
        c1.zwiekszLiczbeWypozyczen();
        c2.zwiekszLiczbeWypozyczen();
        c1.zmniejszLiczbeWypozyczen();
        System.out.println("Stan czytelnikow po wypozyczeniach:");
        c1.wypiszDane();
        c2.wypiszDane();
        Biblioteka biblioteka = new Biblioteka(5);
        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);
        System.out.println();
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Szukamy ksiazki 'Solaris':");
        biblioteka.znajdzKsiazkePoTytule("Solaris");
        int dostepne = biblioteka.policzDostepneKsiazki();
        System.out.println("Laczna liczba dostepnych ksiazek: " + dostepne);
        System.out.println("Stan poczatkowy dostepnych ksiazek:");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Jan probuje wypozyczyc 'Wiedzmin':");
        biblioteka.wypozyczKsiazke("Wiedzmin", c1);
        System.out.println("Stan dostepnych po wypozyczeniu:");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Jan probuje zwrocic 'Wiedzmin':");
        biblioteka.zwrocKsiazke("Wiedzmin", c1);
        System.out.println("Stan dostepnych na koniec:");
        biblioteka.wypiszDostepneKsiazki();
    }
}