
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import examples.Pop;

public class PopTest {

	@Test
	void test() {

		ArrayList<Object> animals = new ArrayList<Object>();
		animals.add("dog");
		animals.add("cat");
		animals.add("fish");
		animals.add("cow");
		Pop One = new Pop(animals);
		ArrayList<Object> numbers = new ArrayList<Object>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		Pop Two = new Pop(numbers);

		assertEquals("[dog, cat, fish]", One.pop().toString());
		assertEquals("[1, 2, 3]", Two.pop().toString());

	}
}
