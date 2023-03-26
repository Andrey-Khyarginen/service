import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int amount = 800;
        int expected = 200;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void remain2() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void remain3() {
        int amount = 1700;
        int expected = 300;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}