void main() {
	try (var in = Integer.class.getResourceAsStream("/java/lang/Integer.class")) {
		var classModel = ClassFile.of().parse(in.readAllBytes());

		System.out.println("Lets see the methods");
		classModel.methods().stream()
			.map(method -> method.methodName().stringValue())
			.map(methodName -> " - " + methodName)
			.forEach(System.out::println);

		System.out.println("Lets see the fields");
		classModel.fields().stream()
			.map(field -> field.fieldName().stringValue())
			.map(fieldName -> " - " + fieldName)
			.forEach(System.out::println);
	} catch (IOException e) {
		e.printStackTrace();
	}
}