/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicgradle;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class LibraryTest {
	@Test
	public void testSomeLibraryMethod() {
		Library classUnderTest = new Library();
		assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
	}
}
