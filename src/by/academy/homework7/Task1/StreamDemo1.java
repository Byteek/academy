package by.academy.homework7.Task1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) throws Exception {

		List<Long> list = Stream
				.generate(() -> (Math.random() * 100))
				.filter(x -> x > 0)
				.limit(100)
				.map(x -> x * Math.PI - 20)
				.map(x -> x.longValue())
				.filter(x -> x < 100)
				.sorted()
				.collect(Collectors.toList());

		
		Map<String, Long> mapNumber = list.stream()
				.distinct()
				.collect(Collectors.toMap(value -> ("Number: " + value + " "), value -> value));
		
		
		List<String> listStr = mapNumber.entrySet().stream()
				.map(x -> x.getKey().toString())
				.sorted()
				.collect(Collectors.toList());
		
		
		System.out.println("");
		list.stream().forEach(System.out::println); //
		System.out.println("");
		System.out.println(mapNumber);
		System.out.println("");
		listStr.stream().forEach(System.out::println);
	}
}

