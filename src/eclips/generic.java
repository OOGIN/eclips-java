package eclips;

//public class generic{
//	public static <T> T getLast(T[]a) {
//		return a[a.length -1];
//	}
//}

public class generic{
	public static void main(String[] args) {
		String[] language = {"c++", "c#", "java"};
		String last = MyArrayAlg.getLast(language);
		System.out.println(last);
	}
}