package core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
	

		List<Integer> test= Arrays.asList( 1,2,3,4,5 );
		
		Stream<Integer> str=test.stream();
		
		System.out.println(str.filter(i -> i>3 ).mapToInt(i->i).sum());
		
		System.out.println(str.filter(i -> i>3 ).mapToInt(i->i).sum());
		
	}

}
