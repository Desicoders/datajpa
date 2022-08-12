package org.simplilearn;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class DemoUtilTest {
	private static DemoUtil demoUtil;
	@BeforeEach
	public void setUpBeforeEach()
	{
		//demoUtil=new DemoUtil();
		System.out.println("@BeforeEch executes before the execution of each test method");
	}
	@Order(1)
	@Test
	@DisplayName("Checking Add method")
	void testEqualsAndNotEquals() {
		assertEquals(6, demoUtil.add(2, 4), "2+4 must be equals to 6");
		assertNotEquals(6, demoUtil.add(1, 9),"1+9 not equal to 6");
	}

	@Order(10)
	@Test
	void testCheckNull() {
		String str1=null;
		String str2="simplilearn";
		assertNull(demoUtil.checkNull(str1),"Object should be null");
		assertNotNull(demoUtil.checkNull(str2),"Object not null");
	}
	@Order(20)
	@Test
	@DisplayName("comparing company name and duplicate name")
	public void testCompanyNameAndDuplicateIsSame()
	{
		String cname="simpli";
		assertSame(demoUtil.getCompanyName(), demoUtil.getDuplicateName());
		assertNotSame(cname, demoUtil.getCompanyName());
	}
	
	@Order(30)
	@Test
	@DisplayName("Checking Biggest Among Two")
	public void testBiggestAmondTwo() {
		int gradeOne=10;
		int gradeTwo=5;
		assertTrue(demoUtil.isGreater(gradeOne, gradeTwo));
		assertFalse(demoUtil.isGreater(gradeTwo, gradeOne));
	}
	@Order(40)
	@Test
	@DisplayName("Array Equals")
	public void testMethodReturnsFirstThreeAlphabets()
	{
		String alphabets[]= {"A","B","C"};
		assertArrayEquals(alphabets, demoUtil.getFirstThreeLetters());
	}
	@Order(50)
	@Test
	public void testLocations()
	{
		List<String> locations=List.of("Delhi","Bombay");
		assertIterableEquals(locations, demoUtil.getLocations());
	}
	@Order(60)
	@Test
	public void testException()
	{
		assertThrows(Exception.class, ()->{
			demoUtil.throwException(-1);
		});
		assertDoesNotThrow(()->{
			demoUtil.throwException(2);
		});
	}
	@Order(70)
	@Test
	@DisplayName("timeout")
	public void timeOut() {
		assertTimeoutPreemptively(Duration.ofSeconds(3), ()->{
			demoUtil.checkTimeOut();
		});
	}
	@AfterEach
	public void tearDownAfterEach()
	{
		//demoUtil=null;
		System.out.println("Running @AfterEach");
	}
	@BeforeAll
	public static void setUpBeforeAll()
	{
		demoUtil=new DemoUtil();
		System.out.println("@BeforeAll executes only once before all test methods are getting executed");
	}
	@AfterAll
	public static void tearDownAfterAll() {
		demoUtil=null;
		System.out.println("@AfterAll get executed only once after all test cases are executed");
	}

}
