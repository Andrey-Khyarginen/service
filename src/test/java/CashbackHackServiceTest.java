import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }
    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
       assertEquals(actual, expected);
    }
    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }
    @Test
    void remain2() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    void remain3() {
        int amount = 1700;
        int expected = 300;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
