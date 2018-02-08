package resources;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jeman on 06.02.18.
 */
public class FailedTest {
    @Test
    public void failedTest() {
        System.out.println("sdfjhslfdjgsdfg");
        System.out.println("sfgsxcvbvbgh");
        System.out.println("23452twetwret");
        System.out.println("6346tsr6256wet");
        System.out.println("tyetyer56356tyd");
        System.out.println("545t45y6y56h5");
        System.out.println("# [Story 1]");
        System.out.println("### [Scenario 1]: Success");
        System.out.println("### [Scenario 1]: Success");
        System.out.println("### [Scenario 1]: Failed with: some error 1");
        System.out.println("### [Scenario 1]: Success");
        System.out.println("# [Story 1]");
        System.out.println("### [Scenario 1]: Success");
        System.out.println("### [Scenario 1]: Failed with: some error 2");
        Assert.assertTrue("Failed with:", false);
    }
}
