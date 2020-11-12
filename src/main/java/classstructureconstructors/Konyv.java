package classstructureconstructors;

public class Konyv {
    String szerzo;
    String cim;
    String regiszam;

    public String getSzerzo()
    {
        return szerzo;
    }
    public String getCim()
    {
        return cim;
    }
    public String getRegiszam()
    {
        return regiszam;
    }

    public Konyv(String szerzo, String cim)
    {
        this.szerzo = szerzo;
        this.cim = cim;
    }

    public void setRegister(String regiszam)
    {
        this.regiszam = regiszam;
    }
}

class KonyvMain{
    public static void main(String[] args)
    {
        Konyv konyvecske = new Konyv("Moldova György",  "Magyar Atom");
        konyvecske.setRegister("1526");

        System.out.println("Szerző :" + konyvecske.getSzerzo());
        System.out.println("Cím :" + konyvecske.getCim());
        System.out.println("Regiszám :" + konyvecske.getRegiszam());
    }
}
