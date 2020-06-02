package by.academy.homework7.Task1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author bytee
 *		Тут попробовал с даблом, потому что у лонга были дубликаты и мапа не хотела принимать одинаковые ключи
 */
public class StreamDemo2 {

	public static void main(String[] args) throws Exception {

		List<Double> list = Stream
				.generate(() -> (Math.random() * 100))
				.filter(x -> x > 0)
				.limit(100)
				.map(x -> x * Math.PI - 20)
				.filter(x -> x < 100)
				.sorted()
				.collect(Collectors.toList());

		
		Map<String, Double> mapNumber = list.stream()
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
