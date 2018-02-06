public class Course {
	private String courseName;
	private int courseNumber;
	private int courseCredits;
	private String professor;
	
	public Course(String courseName, int courseNumber, int courseCredits, String professor) {
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.courseCredits = courseCredits;
		this.professor = professor;
	}
	
	public String getcourseName() {
		return this.courseName;
	}
	
	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getcourseNumber() {
		return this.courseNumber;
	}
	
	public void setcourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;		
	}
	
	public int getcourseCredits() {
		return this.courseCredits;
	}
	
	public void setcourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}
	
	public String getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
}