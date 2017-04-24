import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import info.listReverse.ListReverse;

public class ListReverseTest {
	ListReverse listreverse=null;
	@Before
	public void setup()
	{
		listreverse=new ListReverse();
	}

	@Test
	public void test() {
		ArrayList al=new ArrayList();
		al.add(10);al.add(15);al.add(20);
		List result= listreverse.reverseOrder(al);
		
		ArrayList expected=new ArrayList();
		expected.add(20);
		expected.add(15);
		expected.add(10);
		assertEquals(expected,result);
		
		
		
		
	
	}

}
