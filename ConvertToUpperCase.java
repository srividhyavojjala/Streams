package in.streams;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("srividhya","hussam","supriya");
		list.stream().map(name->name.toUpperCase())
		.forEach(names->System.out.println(names));

	}

}
