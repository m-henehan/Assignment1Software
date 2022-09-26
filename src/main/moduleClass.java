import org.joda.time.DateTime;
public class moduleClass {
    String moduleName;
    String lecturerName
    String moduleID;
    ArrayList<String> students;
    ArrayList<String> courses;

    public moduleClass(String moduleName, String lecturerName, String moduleID, ArrayList<String> students, ArrayList<String> courses)
    {
        this. moduleName = moduleName;
        this.lecturerName = lecturerName;
        this.moduleID = moduleID;
        this.students =students;
        this.courses = courses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public addStudents(String student)
    {
        students.add(student);
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public addCourses(String course)
    {
        courses.add(course);
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

}