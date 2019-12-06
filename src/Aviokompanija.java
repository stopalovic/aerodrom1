import java.time.LocalTime;
import java.util.ArrayList;

public class Aviokompanija {
    private ArrayList<Let> letovi=new ArrayList<Let>();
    private int brletova=0;
    public Aviokompanija(int max)
    {
        ArrayList<Let> letovi=new ArrayList<Let>(max);
    }
    public int brojLetova()
    {
        return brletova;
    }
    public void registrujLet(Aerodrom polazniAerodrom, Aerodrom dolazniAerodrom, LocalTime vrijemePolaska,LocalTime vrijemeDolaska,boolean brzi) {
       if(brletova==letovi.size())
        Let let;
       if(brzi)
    }

}
