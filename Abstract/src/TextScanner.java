public class TextScanner {

	Hello object;
	public TextScanner(Hello obj) {
		this.object=obj;
	}
	void scan() {
		object.onText("Scanned Text");
		
	}
	
	
}