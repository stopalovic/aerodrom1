public class Aerodrom {
    private String nazivAerodroma;
    private String grad;
    private String sifra;
    protected double sirina;
    protected double duzina;

    public void setNazivAerodroma(String nazivAerodroma) {
        this.nazivAerodroma = nazivAerodroma;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public Aerodrom(String nazivAerodroma, String grad, String sifra, double sirina, double duzina) throws IlegalnaSifraAerodroma {
        this.nazivAerodroma = nazivAerodroma;
        this.grad = grad;
        //this.sifra = sifra;
        this.sirina = sirina;
        this.duzina = duzina;
        setSifra(sifra);
    }

    public void setSifra(String sifra) throws  IlegalnaSifraAerodroma {
        String pom="";
        for(int i=0;i<sifra.length();i++)
        {
            boolean b = sifra.charAt(i) >= 'a' && sifra.charAt(i) <= 'z';
            if(b)
            {
                throw new IlegalnaSifraAerodroma("Ilegalna sifra "+sifra+", probajte "+sifra.toUpperCase());
            }
            else if(!((sifra.charAt(i)>='A' && sifra.charAt(i)<='Z') || b) || sifra.length()!=3)
            {
                for(int j=0;j<grad.length();j++)
                {
                    if(pom.length()<3)
                    {
                        if(!((grad.charAt(j)>='A' && grad.charAt(j)<='Z') || (grad.charAt(j)>='a' && grad.charAt(j)<='z'))){continue;}
                        else  pom+=grad.charAt(j);
                    }
                }
                pom=pom.toUpperCase();
                throw new IlegalnaSifraAerodroma("Ilegalna sifra "+sifra+", probajte "+pom);
            }
        }
        this.sifra=sifra;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    public String getNazivAerodroma() {
        return nazivAerodroma;
    }

    public String getGrad() {
        return grad;
    }

    public String getSifra() {
        return sifra;
    }

    public double getSirina() {
        return sirina;
    }

    public double getDuzina() {
        return duzina;
    }
}
