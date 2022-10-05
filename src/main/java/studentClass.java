import org.joda.time.DateTime;
import java.util.ArrayList;

public class studentClass {
    String name;
    Integer age;
    DateTime DOB;
    String ID;
    String username;
    ArrayList<String> courses;
    ArrayList<String> modules;

    public studentClass(String name, Integer age, DateTime DOB, String ID, ArrayList<String> courses, ArrayList<String> modules)
    {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
        setUsername(name, age);
        username = setUsername(name, age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String setUsername(String name, Integer age)
    {
        name = name.replaceAll(" ", "");
        username = name + age;
        return username;
    }

    public String getUsername()
    {
        return username;
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
}
