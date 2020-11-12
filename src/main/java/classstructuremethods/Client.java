package classstructuremethods;

import java.util.Scanner;

public class Client {

    String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    int szuletesiev;

    public int getSzuletesiev()
    {
        return szuletesiev;
    }

    public void setSzuletesiev(int szuletesiev)
    {
        this.szuletesiev = szuletesiev;
    }


    String cim;

    public String getCim()
    {
        return cim;
    }

    public void setCim(String cim)
    {
        this.cim = cim;
    }

    public void migrate(String address)
    {
        this.cim = address;
    }
}


class ClientMain {
    public static void main(String[] args) {

        Client kliens = new Client();

        kliens.setName("Kovács Kázmér");
        kliens.setSzuletesiev(1956);
        kliens.setCim("Sas utca  21");

        System.out.println("Neve :" +  kliens.getName());
        System.out.println("Születési éve :" +  kliens.getSzuletesiev());
        System.out.println("Cime :" +  kliens.getCim());

        kliens.migrate("Péter Pál utca 21");

        System.out.println("Az  Új  Cim :" +  kliens.getCim());
    }
}