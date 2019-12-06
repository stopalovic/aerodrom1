import java.time.LocalTime;

public class BrziLet extends Let{

    public BrziLet(Aerodrom polazniAerodrom, Aerodrom dolazniAerodrom, LocalTime vrijemePolasaka, LocalTime vrijemeDolaska) {
        super(polazniAerodrom, dolazniAerodrom, vrijemePolasaka, vrijemeDolaska);
    }
    @Override
    public double duzinaLeta()
    {
        double x1,x2,y1,y2,d;
        x1=polazniAerodrom.getDuzina();
        x2=dolazniAerodrom.getDuzina();
        y1=polazniAerodrom.getSirina();
        y2=dolazniAerodrom.getSirina();
        d=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))/2.;
        return  d;
    }

}
