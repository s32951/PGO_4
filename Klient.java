import java.util.ArrayList;
import java.util.List;

public class Klient {

    private String imie;
    private String nazwisko;
    private String email;
    private List<Wydarzenie> listaRezerwacji = new ArrayList<>();

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void setListaRezerwacji(List<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        this.listaRezerwacji.add(wydarzenie);
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        this.listaRezerwacji.remove(wydarzenie);
    }

    public void wyświetlRezerwacje() {
        System.out.println("Rezerwacje klienta " + imie + " " + nazwisko + ":");
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak rezerwacji.");
        } else {
            for (Wydarzenie rezerwacja : listaRezerwacji) {
                System.out.println("- " + rezerwacja.getNazwa() + " (" + rezerwacja.getMiejsce() + ", " + rezerwacja.getData() + ")");
            }
        }
    }
}