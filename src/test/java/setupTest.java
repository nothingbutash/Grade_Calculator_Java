

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

        MarkedThingy pOLI110 = new MarkedThingy(0);

        MarkedThingy midTerm = new MarkedThingy(0);
        Mark midTermMark = new Mark(20.9/25 * 100);
        midTerm.addSubGradable(midTermMark);
        midTerm.setWeight(25);

        MarkedThingy hW = new MarkedThingy(0);
        MarkedThingy hW1 = new MarkedThingy(0);
        Mark hW1Mark = new Mark(4/5);
        hW1.addSubGradable(hW1Mark);
        MarkedThingy hW2 = new MarkedThingy(0);
        Mark hW2Mark = new Mark(3.15/5);
        hW2.addSubGradable(hW2Mark);
        MarkedThingy hW3 = new MarkedThingy(0);
        Mark hW3Mark = new Mark(5/5);
        hW3.addSubGradable(hW3Mark);
        MarkedThingy hW4 = new MarkedThingy(0);
        Mark hW4Mark = new Mark(4.6/5);
        hW4.addSubGradable(hW4Mark);
        MarkedThingy hW5 = new MarkedThingy(0);
        Mark hW5Mark = new Mark(5/5);
        hW5.addSubGradable(hW5Mark);
        hW.addSubGradable(hW1);
        hW.addSubGradable(hW2);
        hW.addSubGradable(hW3);
        hW.addSubGradable(hW4);
        hW.addSubGradable(hW5);
        hW1.setWeight(20);
        hW2.setWeight(20);
        hW3.setWeight(20);
        hW4.setWeight(20);
        hW5.setWeight(20);
        hW.setWeight(25);

        MarkedThingy attendance = new MarkedThingy(0);
        Mark attendanceMark = new Mark(100);
        attendance.addSubGradable(attendanceMark);
        attendance.setWeight(15);

        pOLI110.addSubGradable(midTerm);
        pOLI110.addSubGradable(hW);
        pOLI110.addSubGradable(attendance);
        
        assertEquals(expectedAvg, pOLI110.getMark());
    }
}
