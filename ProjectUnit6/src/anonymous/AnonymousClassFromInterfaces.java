package anonymous;
public class AnonymousClassFromInterfaces {

	interface InterfaceName {

		public void methodName(String name);

	}

	public static void main(String[] args) {

		InterfaceName anon = new InterfaceName() {
			@Override
			public void methodName(String name) {

				System.out.println("Method overriden for the anonymous class:" + name);
			}

		};

		anon.methodName("Mildred");

	}

}
