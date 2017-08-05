package IntroToJUnitTest;



import static org.junit.Assert.*;

import org.junit.Test;

public class JUntiTest {
	public static void main(String[] args) {
		JUntiTest test = new JUntiTest();
		
		
		
	}
int add(int a, int b){
	
	return a+b;
}
@Test
public void test() {
	int c=add(2, 2);	
	assertEquals(c,4);
	
}


}

