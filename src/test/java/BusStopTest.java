import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Bus bus;
    BusStop busStop;
    Person person;

    @Before
    public void setUp(){
        busStop = new BusStop("Princes St.");
        person = new Person();
        bus = new Bus("The Gyle", 4);

    }

    @Test
    public void hasName(){
        assertEquals("Princes St.", busStop.getName());
    }

    @Test
    public void emptyQueue(){
        assertEquals(0, busStop.queueSize());
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueSize());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.queueSize());
    }

}
