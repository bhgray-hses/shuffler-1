import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LineListTest {

	LineList ll;
	
	@Before
	public void setUp() throws Exception {
		ll = new LineList();
	}

	@Test
	public void testAdd() {
		ll.add("a");
		assertEquals("")
	}

}
