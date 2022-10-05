import java.util.ArrayList;
import org.joda.time.DateTime;

public class courseProgrammeClass {
    String courseName;
    String lecturerName;
    ArrayList<String> students;
    ArrayList<String> courses;
    DateTime startDate;
    DateTime endDate;

    public courseProgrammeClass(String courseName, String lecturerName, ArrayList<String> students, ArrayList<String> courses, DateTime startDate, DateTime endDate)
    {
        this. courseName = courseName;
        this.lecturerName = lecturerName;
        this.students =students;
        this.courses = courses;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void addStudents(String student)
    {
        students.add(student);
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourses(String course)
    {
        courses.add(course);
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

}
