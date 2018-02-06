public class CourseController {
	private CourseView courseView;
	private Course course;
	
	public CourseController(Course course, CourseView courseView) {
		this.course = course;
		this.courseView = courseView;
	}
	
	public CourseController(Course[] course2, CourseView courseView2) {
		// TODO Auto-generated constructor stub
	}

	public void printCourseDetails() {
		this.courseView.printCourseDetails(this.course);
	}
}