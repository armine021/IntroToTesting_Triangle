import java.beans.Transient;
import static org.junit.Assert.*;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

  @Test
  public void test_is_triangle_1() {
    assertTrue(Demo.isTriangle(3,4,5));
  }

  @Test
  public void test_is_triangle_2() {
    assertTrue(Demo.isTriangle(4,3,5));
  }

	@Test
	public void TestIsNOTTriangle1() {
		assertFalse(Demo.isTriangle(30, 10, 40));
   }

  @Test
	public void TestIsNOTTriangle2() {
		assertFalse(Demo.isTriangle(10, 30, 40));
   }

  @Test
	public void TestIsNOTTriangle3() {
		assertFalse(Demo.isTriangle(10, 40, 30));
   }

	@Test
	public void TestIsNOTTriangle4() {
		assertFalse(Demo.isTriangle(-3, 10, 20));
    }

  @Test
	public void TestIsNOTTriangle5() {
		assertFalse(Demo.isTriangle(10, -3, 20));
    }

  @Test
	public void TestIsNOTTriangle6() {
		assertFalse(Demo.isTriangle(20, 10, -3));
    }

  @Test
	public void TestIsNOTTriangle7() {
		assertFalse(Demo.isTriangle(0, 10, 20));
    }

  @Test
	public void TestIsNOTTriangle8() {
		assertFalse(Demo.isTriangle(1.4, 10, 20));
    }

  @Test
	public void TestIsNOTTriangle9() {
		assertFalse(Demo.isTriangle(1, 10.3, 20));
    }

  @Test
	public void TestIsNOTTriangle10() {
		assertFalse(Demo.isTriangle(1, 10, 20.7));
    }
}
