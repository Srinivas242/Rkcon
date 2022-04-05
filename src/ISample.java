
public interface ISample {
	public void sample();

	public String toString();

	default void dTest() {
		System.out.println("world is new");

	}

	default int dAdd(int a, int b) {
		return a + b;

	}

	static void sTest() {
		System.out.println("testing static");

	}

}
