package Tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class NeedJobTest {
	
	@Test // Тестирование кода
	public void testReplace() {
		assertEquals("((())())", NeedJob.replace("programming"));
		assertEquals("()()()()", NeedJob.replace("java"));
		assertEquals("()", NeedJob.replace("hi"));
		assertEquals("", NeedJob.replace(""));
		assertNull(NeedJob.replace(null));
	}
	
	@Test
	public void testMain() {
        NeedJob.main(new String[] {});
        
	}
}
