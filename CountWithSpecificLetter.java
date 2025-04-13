package in.streams;

import java.util.Arrays;
import java.util.List;

public class CountWithSpecificLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("srividhya","supriya","hussam");
		
		long counting = list.stream().filter(name->name.startsWith("s")).count();
		
		System.out.println(counting);

	}

}
