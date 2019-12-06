import java.time.LocalTime;
public class Let {
   protected Aerodrom polazniAerodrom;
   protected Aerodrom dolazniAerodrom;
    protected LocalTime vrijemePolaska;
    protected LocalTime vrijemeDolaska;

    public Let(Aerodrom polazniAerodrom, Aerodrom dolazniAerodrom, LocalTime vrijemePolasaka, LocalTime vrijemeDolaska) {
        this.polazniAerodrom = polazniAerodrom;
        this.dolazniAerodrom = dolazniAerodrom;
        this.vrijemePolaska = vrijemePolasaka;
        this.vrijemeDolaska = vrijemeDolaska;
    }

    public Aerodrom getPolazniAerodrom() {
        return polazniAerodrom;
    }

    public Aerodrom getDolazniAerodrom() {
        return dolazniAerodrom;
    }

    public LocalTime getVrijemePolaska() {
        return vrijemePolaska;
    }

    public LocalTime getVrijemeDolaska() {
        return vrijemeDolaska;
    }

    public void setPolazniAerodrom(Aerodrom polazniAerodrom) {
        this.polazniAerodrom = polazniAerodrom;
    }

    public void setDolazniAerodrom(Aerodrom dolazniAerodrom) {
        this.dolazniAerodrom = dolazniAerodrom;
    }

    public void setVrijemePolasaka(LocalTime vrijemePolasaka) {
        this.vrijemePolaska = vrijemePolasaka;
    }

    public void setVrijemeDolaska(LocalTime vrijemeDolaska) {
        this.vrijemeDolaska = vrijemeDolaska;
    }
    public int trajanje() {
        int vrijeme= (vrijemeDolaska.getHour() * 60) + vrijemeDolaska.getMinute()-((vrijemePolaska.getHour() * 60) + vrijemePolaska.getMinute());
        return vrijeme;
    }
    public double duzinaLeta()
    {
        double x1,x2,y1,y2,d;
        x1=polazniAerodrom.getDuzina();
        x2=dolazniAerodrom.getDuzina();
        y1=polazniAerodrom.getSirina();
        y2=dolazniAerodrom.getSirina();
        d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        return d;
    }
}
