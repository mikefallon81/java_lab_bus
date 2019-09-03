import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before

    public void setup(){
        bus = new Bus("The Gyle", 4);
        person = new Person();
        busStop = new BusStop("Princes St.");
    }

    @Test
    public void canGetDestination(){
        assertEquals("The Gyle", bus.getDestination());
    }

    @Test
    public void canCheckNoOfPassengers(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void cantAddPassengerIfFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(4, bus.getPassengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void getPassengerFromBusStop(){
        busStop.addPersonToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.getPassengerCount());
    }

}
