public class CourseView {
	private Course course;
	
	public CourseView(Course course) {
		this.course = course;
	}
	
	public CourseView() {
		
	}
	
	public void printCourseDetails(Course course) {
		this.course = course;
		printCourseDetails();
	}
	
	public void setCourseDetails(Course course) {
	
	}
	
	public void printCourseDetails() {
		if (this.course == null) throw new IllegalArgumentException("course");		

		System.out.println("Course name is " + this.course.getcourseName());
		System.out.println("Course number is " + this.course.getcourseNumber());
		System.out.println("Course credit(s): " + this.course.getcourseCredits());
		System.out.println("Course professor is " + this.course.getProfessor());
	}
}