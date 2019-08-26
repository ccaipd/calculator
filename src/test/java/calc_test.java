//@Test
import org.junit.Assert;

public class calc_test {
    public  void testSum (String args[]) {
		 System.out.println("sum");
		 Integer x = 15;
		 Integer y = 15;
		 Integer expResult = 30;
		 Integer result = calculator.sum(x, y);
		Assert.assertEquals(expResult, result);
		Assert.assertEquals(null, calculator.sum(15, null));
		Assert.assertEquals(null, calculator.sum(null, 15));
		Assert.assertEquals(null, calculator.sum(null, null));

    }
}
