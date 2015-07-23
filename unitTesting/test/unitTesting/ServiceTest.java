package unitTesting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ServiceTest {

	@Test
	public void testAddSet() {
		Service service = new Service();
		assertEquals(true, service.addSet("a"));
		assertEquals(true, service.addSet("b"));
		assertEquals(false, service.addSet("a"));
	}
	
	@Test
	public void testAddList() {
		Service service = new Service();
		service.addList("a");
		service.addList("b");
		service.addList("a");
		assertEquals(3, service.getList().size());
	}
	
	@Test
	public void testSortList() {
		
		Service service = new Service();
		service.addList("a");
		service.addList("c");
		service.addList("b");
		service.sortList();
		
		List<String> expected =  new ArrayList<String>();
		expected.add("a");
		expected.add("b");
		expected.add("c");
		
		assertEquals(expected, service.getList());
	}
	
}
