import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;
        int actual = service.remain(amount);
        int expected = 300;
        Assert.assertEquals(actual, expected);
    }
}