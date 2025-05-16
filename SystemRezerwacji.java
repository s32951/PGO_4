import java.util.ArrayList;
import java.util.List;

public class SystemRezerwacji {

    private List<Wydarzenie> wydarzenia = new ArrayList<>();
    private List<Klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        this.wydarzenia.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        this.klienci.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenia.contains(wydarzenie) && klienci.contains(klient)) {
            if (wydarzenie.zarezerwujMiejsce()) {
                klient.dodajRezerwacje(wydarzenie);
                System.out.println("Dokonano rezerwacji dla " + klient.getImie() + " " + klient.getNazwisko() + " na wydarzenie: " + wydarzenie.getNazwa());
            } else {
                System.out.println("Brak dostępnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
            }
        } else {
            System.out.println("Nie można dokonać rezerwacji. Sprawdź, czy klient i wydarzenie istnieją.");
        }
    }

    public Wydarzenie znajdźWydarzenie(String nazwaWydarzenia) {
        for (Wydarzenie wydarzenie : wydarzenia) {
            if (wydarzenie.getNazwa().equals(nazwaWydarzenia)) {
                return wydarzenie;
            }
        }
        return null;
    }
}