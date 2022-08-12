package org.simplilearn;

import java.util.List;

public class DemoUtil {
	private String companyName="Simplilearn";
	private String duplicateName=companyName;
	private String firstThreeLetters[]= {"A","B","C"};
	private List<String> locations=List.of("Delhi","Bombay");
	public String getCompanyName() {
		return companyName;
	}
	public String getDuplicateName() {
		return duplicateName;
	}
	public String[] getFirstThreeLetters() {
		return firstThreeLetters;
	}
	public List<String> getLocations() {
		return locations;
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int multuply(int a,int b)
	{
		return a*b;
	}
	public Object checkNull(Object obj)
	{
		if(obj!=null)
		{
			return obj;
		}
		return null;
	}
	public Boolean isGreater(int n1,int n2) {
		if(n1>n2)
		{
			return true;
		}
		return false;
	}
	public String throwException(int a)throws Exception
	{
		if(a<0)
		{
			throw new Exception("Value must be greater than o");
		}
		return "Value is greater than 0";
	}
	public void checkTimeOut() throws InterruptedException
	{
		System.out.println("I am going to teach");
		Thread.sleep(2000);
		System.out.println("Sleeping is over");
		
	}
}
