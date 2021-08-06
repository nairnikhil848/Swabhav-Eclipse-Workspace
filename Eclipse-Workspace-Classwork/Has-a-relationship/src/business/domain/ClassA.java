package business.domain;

public class ClassA {
	private IFooable b;
	public ClassA(IFooable b) {
		this.b = b;
	}
	public void bar() {
		b.foo();
		System.out.println("bar executed");
	}
}
