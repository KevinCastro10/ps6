package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Person_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Person test = new Person();
		test.addPerson("Kenny");
		assertsEquals("Kenny",test);	
	}

	@Test
	public void test2() {
		Person test = new Person();
		test.getPerson("Kenny");
		assertsEquals("Kenny",test);	
	}
	
	@Test
	public void test3() {
		Person test = new Person();
		test.getPerons("Kenny","John");
		assertsEquals("Kenny","John",test);	
	}
	
	@Test
	public void test4() {
		Person test = new Person();
		test.deletePerson("Kenny");
		assertsEquals("",test);	
	}
	
	@Test
	public void test5() {
		Person test = new Person();
		test.updatePerson("Kenny");
		assertsEquals("Kenny",test);	
	}
	
}

