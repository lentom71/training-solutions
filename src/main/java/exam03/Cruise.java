package exam03;

import week15.d05.CovidesetszamOrszag;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Cruise
{
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger>  passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice)
    {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }


    public boolean bookPassenger(Passenger passenger)
    {
        if(boat.getMaxPassengers() > passengers.size())
        {
            return true;
        }
        else
        {
            throw new IllegalStateException("Nincs elég hely!");
        }
    }

    public double getPriceForPassenger(Passenger passenger)
    {
        return   basicPrice * passenger.getCruiseClass().getLuxuryPrice();
    }

    public Passenger findPassengerByName(String name)
    {
        for (Passenger pas: passengers)
        {
            if (pas.getName().equals(name))
            {
                return  pas;
            }
        }
        return null;
    }

    public List<String>  getPassengerNamesOrdered()
    {
        List<String>  result = new ArrayList<>();
        for(Passenger pas: passengers)
        {
            result.add(pas.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged()
    {
        double sum = 0;
        for(Passenger pas: passengers)
        {
            sum = sum + getPriceForPassenger(pas);

        }
        return sum;
    }

    public Map<CruiseClass, Integer>  countPassengerByClass()
    {
        Map<CruiseClass, Integer>  osztalyonkentUtasok = new HashMap<>();
        int sum = 1;

        for (Passenger pas: passengers)
        {
            if(!osztalyonkentUtasok.containsKey(pas.getCruiseClass()))
            {
                osztalyonkentUtasok.put(pas.getCruiseClass(), sum);
            }
            else
            {
                sum = sum +1;
                osztalyonkentUtasok.put(pas.getCruiseClass(), sum);
            }
        }
        return  osztalyonkentUtasok;
    }




    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
