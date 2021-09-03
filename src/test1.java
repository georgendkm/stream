import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	//Count the number of names starting with alphabet A in list
	@Test
	public void regular()
	{
	ArrayList<String> names=new ArrayList<String>();
	names.add("Abhi");
	names.add("Don");
	names.add("Ale");
	names.add("Adam");
	names.add("Ram");
	int count=0;
	
	for(int i=0;i<names.size();i++)
	{
		String actual=names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
	}

	System.out.println(count);	
		
		
	}

	
	@Test
	public void addNum() {
		int a=10, b=10, sum=0;
		sum= a+b;
		System.out.println(sum);
		
	System.out.println("changes from eclipse");
	System.out.println("from develop Branch");
	
	System.out.println("new changes from apex workspace");
	
	}
	
	
}

