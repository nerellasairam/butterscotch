package core.annotations;

public class AnnotationExample {

	public static void main(String[] args) {
	}

	
	@MyAnnotation(message = "Main method toMyString ", revision = 1)
	public String toMyString() {
		return "Overriden toString method";
	}



}
