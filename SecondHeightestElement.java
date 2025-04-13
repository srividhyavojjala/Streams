package in.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHeightestElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,40,70,60,30,50,20,30,20);
		
		Optional<Integer> orderList = list.stream().distinct().
				sorted(Comparator.reverseOrder()).skip(1).findFirst();
				
		System.out.println(list);
		System.out.println(orderList);

	}

}
