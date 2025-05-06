

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void test1t() { //test init of MarkedThingy

        try {
            new MarkedThingy();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void test2t() { //test overloaded init of MarkedThingy

        try {
            new MarkedThingy(0);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void test3t() { //test init of Mark

        try {
            new Mark(0);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void test4t() { //test init of Mark

        try {
            new Mark(0);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void test5t() { //test init of Mark

        MarkedThingy m = new MarkedThingy();

        m.addSubGradable(new Mark(100));
        m.addSubGradable(new Mark(100));

        assertEquals(100, m.getMark());
    }
        

    @Test
    void test6t() { //test init of Mark

        MarkedThingy m = new MarkedThingy();

        m.addSubGradable(new Mark(100));

        assertEquals(100, m.getMark());
    }

    @Test
    void test7t() { //test init of Mark

        MarkedThingy m = new MarkedThingy();

        m.addSubGradable(new Mark(100));

        assertEquals(1, m.getSubGradables().size());
    }

    @Test
    void test8t() { //test init of Mark

        Mark m = new Mark(100);
     
        assertEquals(100, m.getMark());
    }

    @Test
    void test9t() { //test init of Mark

        List<Integer> l = Arrays.asList(1,2,3,4);

        assertEquals(4, l.stream().skip(0).count());
    }

    @Test
    void test10t() { //test init of Mark

        MarkedThingy m = new MarkedThingy(0);
        assertEquals(0, m.getDropXLowest());
    }

    @Test
    void test11t() { //test init of Mark

        MarkedThingy m = new MarkedThingy();
        assertEquals(0, m.getDropXLowest());
    }

    @Test
    void test12t() { //test init of Mark

        Mark m = new Mark(100);
        assertEquals(1, m.getWeight());
    }

    @Test
    void test13t() { //test init of Mark

        MarkedThingy m = new MarkedThingy();

        m.addSubGradable(new Mark(100));
        m.addSubGradable(new Mark(0));

        assertEquals(50, m.getMark());
    }
        

    @Test
    void test14t() { //test init of Mark

        MarkedThingy m = new MarkedThingy();

        m.addSubGradable(new Mark(100));
        m.addSubGradable(new Mark(100));
        m.addSubGradable(new Mark(100));
        m.addSubGradable(new Mark(0));

        assertEquals(75, m.getMark());
    }

    @Test
    void test15t() { //test init of Mark

        MarkedThingy m1 = new MarkedThingy();

        m1.addSubGradable(new Mark(100));
        m1.addSubGradable(new Mark(100));
        m1.addSubGradable(new Mark(0));
        m1.addSubGradable(new Mark(0));

        MarkedThingy m2 = new MarkedThingy();

        m2.addSubGradable(new Mark(100));

        MarkedThingy m3 = new MarkedThingy();
        m3.addSubGradable(m2);
        m3.addSubGradable(m1);

        assertEquals(75, m3.getMark());
    }
}
