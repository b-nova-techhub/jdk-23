import static java.lang.classfile.ClassFile.ACC_PUBLIC;
import static java.lang.classfile.ClassFile.ACC_STATIC;
import static java.lang.constant.ConstantDescs.CD_String;
import static java.lang.constant.ConstantDescs.CD_void;

void main() throws IOException {
	var system = ClassDesc.of("java.lang", "System");
	var printStream = ClassDesc.of("java.io", "PrintStream");

	ClassFile.of().buildTo(
		Path.of("Hello.class"),
		ClassDesc.of("Hello"),
		classBuilder -> classBuilder
			.withMethodBody(
				"main",
				MethodTypeDesc.of(CD_void, CD_String.arrayType()),
				ACC_PUBLIC | ACC_STATIC,
				codeBuilder -> codeBuilder
					.getstatic(system, "out", printStream)
					.aload(codeBuilder.parameterSlot(0))
					.iconst_0()
					.aaload()
					.invokevirtual(printStream, "println", MethodTypeDesc.of(CD_void, CD_String))
					.return_()));
}