package sis.studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void testCreate() {
		final String firstStudentName = "Jane Doe";
		Student firststudent = new Student(firstStudentName);
		assertEquals(firstStudentName, firststudent.getName());

		final String secondStudentName = "Joe Blow";
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());

	}

}
