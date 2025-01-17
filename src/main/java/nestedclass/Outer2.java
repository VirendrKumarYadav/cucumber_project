package nestedclass;

public class Outer2 {
	int num1, num2;

	class InnerClass {

		public int sum(int num1, int num2) {

			return num1 + num2;
		}

		public int sum() {

			return num1 + num2;
		}
	}
}
