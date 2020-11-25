package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(2,3,4,5);
		List<Integer> square=number.stream().map(x-> x*x).collect(Collectors.toList());
		System.out.println(square);
		List<String> names=Arrays.asList("Reflection","Collection","Stream");
		List<String> result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		int even=number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(even);
		

	}

}
