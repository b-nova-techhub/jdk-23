void main() {
	var number = 5;
	switch (number) {
		case 1 -> System.out.println("One");
		case 2 -> System.out.println("Two");
		case int i when i > 10 -> System.out.println("number " + i + " is too high");
		case int i -> System.out.println("number " + i + " is not supported");
	}

	var littleNumber = 200;
	if (littleNumber instanceof byte littleByteNumber) {
		System.out.println("littleByteNumber: " + littleByteNumber);
	} else {
		System.out.println("littleNumber " + littleNumber + " is too big for a byte");
	}
}