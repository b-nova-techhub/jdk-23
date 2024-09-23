package com.bnova.techhub.jdk23.jep476;

import module java.base;

public class After {
	void main() {
		String[] places = new String[]{"Basel", "Zürich", "Genf"};
		Map<String, String> placeMap =
			Stream.of(places)
				.collect(Collectors.toMap(s -> s.toUpperCase().substring(0, 1),
					Function.identity()));
		System.out.println(placeMap);
	}
}