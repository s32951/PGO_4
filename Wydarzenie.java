public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = maxLiczbaMiejsc;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = "";
        this.miejsce = "";
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }


    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
        this.dostepneMiejsca = Math.min(this.dostepneMiejsca, maxLiczbaMiejsc);
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = Math.max(0, Math.min(dostepneMiejsca, maxLiczbaMiejsc));
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    @Override
    public String toString() {
        return "Wydarzenie{" +
                "nazwa='" + nazwa + '\'' +
                ", data='" + data + '\'' +
                ", miejsce='" + miejsce + '\'' +
                ", maxLiczbaMiejsc=" + maxLiczbaMiejsc +
                ", dostepneMiejsca=" + dostepneMiejsca +
                ", cena=" + cena +
                '}';
    }

    public boolean zarezerwujMiejsce() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
            return true;
        }
        return false;
    }

    public void zwolnijMiejsce() {
        if (dostepneMiejsca < maxLiczbaMiejsc) {
            dostepneMiejsca++;
        }
    }
}