import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jeman on 06.02.18.
 */
public class SimpleTest {

    @Test
    public void successTest() {
        System.out.println("Success test");
    }

    @Test
    public void failedTest() {
        System.out.println("Failed test");
        Assert.assertTrue("Failed with:", false);
    }
}
