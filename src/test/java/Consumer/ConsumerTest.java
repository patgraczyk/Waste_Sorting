package Consumer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConsumerTest {

    Consumer consumer;

    @Before
    public void before(){
        consumer = new Consumer(0);
    }

    @Test
    public void hasNoGreenPoints(){
        assertEquals(0, consumer.getGreenpoints());
    }
}
