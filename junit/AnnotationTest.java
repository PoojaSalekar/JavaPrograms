package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.AfterClass;

public class AnnotationTest {

	@Test
	public void test1() {
		System.out.println("Test case 1 : inside test case");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2 : inside test case");
	}
	
	@Before
	public void before() {
		System.out.println("inside before ");
	}
	
	@After
	public void after() {
		System.out.println("inside after ");
	}
	
	@Ignore
	public void ignore() {
		System.out.println("inside Ignore :it will not execute");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Inside before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("inside after class");
	}
}
