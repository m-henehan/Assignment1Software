import java.util.ArrayList;
import org.joda.time.DateTime;

public class courseProgrammeClass {
    String courseName;
    ArrayList<String> students;
    ArrayList<String> modules;
    DateTime startDate;
    DateTime endDate;

    public courseProgrammeClass(String courseName, ArrayList<String> students, ArrayList<String> modules, DateTime startDate, DateTime endDate)
    {
        this. courseName = courseName;
        this.students =students;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public ArrayList<String> getModules() {
        return modules;
    }

    public void addModules(String module)
    {
        modules.add(module);
    }

    public void setModules(ArrayList<String> modules) {
        this.modules = modules;
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
