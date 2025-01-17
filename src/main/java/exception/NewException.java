package exception;


public class NewException {

	public static void checkedException() {
//		try {
//			new FileReader("");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		int i = 8, i2 = 0;
		System.out.println(i / i2);

	}

	public static void main(String[] args) throws DerivedArthmatcExceptions {

		try {
			checkedException();
		} catch (Exception e) {
		
		}finally {
			throw new DerivedArthmatcExceptions("this is derived Arthmatic exceptions");
		}
	}

}
