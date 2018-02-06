
public class MyMvcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Gabe", "Gayanelo", "gabrielmark.gayanelo@student.shu.edu", 123456);
		StudentView studentView =  new StudentView();
		StudentController controller =  new StudentController(student, studentView);
		
		controller.printStudentDetails();
		
		Professor professor = new Professor("Garett", "Chang", "garrett.chang@shu.edu", 7891011);
		ProfessorView professorView = new ProfessorView();
		ProfessorController controller1 = new ProfessorController(professor, professorView);
		
		controller1.printProfessorDetails();
		
		Course course = new Course("Software Engineering II", 1, 3, "Garrett Chang");
		CourseView courseView = new CourseView();
		CourseController controller2 = new CourseController(course, courseView);
		
		controller2.printCourseDetails();

	}

}
