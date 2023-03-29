import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int expected = 200;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        assertEquals(actual, expected);
    }
    @Test
    public void test() {
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
    @Test
    public void test3() {
        int expected = 300;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1700);
        assertEquals(actual, expected);
    }
}