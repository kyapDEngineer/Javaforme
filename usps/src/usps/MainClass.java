package usps;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass
	{
		public static void main(String[] args) {
			
			// find the duplicate elements in a given integers list in java using stream function?
			List<Integer> list = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 20, 80, 80, 78, 76);
			Set<Integer> set = new HashSet<>();
			list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
		}
	}
