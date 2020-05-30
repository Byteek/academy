package by.academy.homework7.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
//		{long count = Stream
//		.generate(() -> new Random().nextInt(100))
//		.limit(100)
//		.forEachOrdered(e  -> e * Math.PI - 20)
//		.peek(System.out::println)
//		.count();     //завершающая операция    
//		System.out.println(count + "End");
//		}
		long[] longs;

		longs = new Random().longs(100, 0, 100).toArray();

//		streamLong.limit(100).peek(System.out::println).count();

	}
}
