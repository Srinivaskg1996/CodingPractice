package CodingPractice;

public class String_RemoveSpecialOrJunkCharactor {

	public static void main(String[] args) {
		
		String s= "$%^&*(*&^% Sring Name is&*()5678987";
		
		System.out.println((s.replaceAll("[^a-zA-Z0-9]", "")));

	}

}
