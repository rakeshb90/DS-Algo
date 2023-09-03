package java8;
// We can define default concrete method also in interface in java8
public interface DefaultMethodInterf {
	public default void method2() {
		System.out.println("DefaultMethodInterf => method2");
	}

}
