import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class setupTest {
    @Test
    void test1() {
        assertEquals(2, 1+1);
    }

    @Test
    void test2() {
        double expectedAvg  = 88.6923076923;
        MarkedThingy midTerm = new MarkedThingy(0);
        Mark midTermMark = new Mark(20.9/25 * 100);

        MarkedThingy hW = new MarkedThingy(0);
        MarkedThingy hW1 = new MarkedThingy(0);
        Mark hW1Mark = new Mark(4/5);
        MarkedThingy hW2 = new MarkedThingy(0);
        Mark hW2Mark = new Mark(3.15/5);
        MarkedThingy hW3 = new MarkedThingy(0);
        Mark hW3Mark = new Mark(5/5);
        MarkedThingy hW4 = new MarkedThingy(0);
        Mark hW4Mark = new Mark(4.6/5);
        MarkedThingy hW5 = new MarkedThingy(0);
        Mark hW5Mark = new Mark(5/5);

        MarkedThingy attendance = new MarkedThingy(0);
        Mark attendanceMark = new Mark(100);
    }
}
