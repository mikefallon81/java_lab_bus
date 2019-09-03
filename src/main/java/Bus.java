import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> busPeople;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.busPeople = new ArrayList<Person>();
    }


    public String getDestination() {
        return this.destination;
    }

    public int getPassengerCount() {
        return this.busPeople.size();
    }

    public void addPassenger(Person person) {
        if(this.getPassengerCount() < this.capacity)
        {
            this.busPeople.add(person);
        }

    }

    public void removePassenger(Person person) {
        this.busPeople.remove(0);
    }

    public void pickUp(BusStop busStop){

        Person person = busStop.removePersonFromQueue();
        this.busPeople.add(person);
    }
}
