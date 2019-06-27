package teste;

public class TryCashFinally {

	public void a() throws Exception {

	}

	public void b(String string) {

		throw new NullPointerException();
	}

	public void c() {

		try {
			b(null);
			System.out.println(123);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		new TryCashFinally().c();
	}

}
