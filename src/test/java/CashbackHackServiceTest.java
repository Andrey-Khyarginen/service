import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void test() {

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void test3() {

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1700);
        int expected = 300;
        assertEquals(expected, actual);
    }
}