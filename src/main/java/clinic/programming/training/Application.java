
package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {

	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hey!!");

		for(String greeting: greetings) {
			System.out.println(greeting);
		}
	}

	public static int countWords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();

		int count = countWords("I have 4 words");
		System.out.println("Word count " + count);
    }
}