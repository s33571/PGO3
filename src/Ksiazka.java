public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Ksiazka: '" + tytul + "', Autor: " + autor + ", Strony: " + liczbaStron + ", Dostepna: " + dostepna);
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Pomyslnie wypozyczono ksiazke: " + tytul);
        } else {
            System.out.println("Przepraszamy, ksiazka '" + tytul + "' jest juz wypozyczona.");
        }
    }

    public void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Pomyslnie zwrocono ksiazke: " + tytul);
        } else {
            System.out.println("Ksiazka '" + tytul + "' nie byla wypozyczona (jest w bibliotece).");
        }
    }
    public String getTytul(){
        return tytul;
    }
    public boolean isDostepna(){
        return dostepna;
    }
}
