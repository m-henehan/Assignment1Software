import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class testModuleClassJunit {
    ArrayList<String> courses = new ArrayList<>(){
        {
            add("Computer Science");
        }
    };

    ArrayList<String> students = new ArrayList<>(){
        {
            add("Maria Henehan");
            add("Christina Heaney");
            add("Seamus Dewar");
        }
    };

    moduleClass softwareEng = new moduleClass("Software Engineering", "Michael Schukat", "ct417", students, courses);
    @Test
    public void testAddStudents()
    {
        softwareEng.addStudents("Heather O'Brien");
        students.add("Heather O'Brien");
        Assertions.assertEquals(students, softwareEng.getStudents());
    }

    @Test
    public void testModuleLecturerName()
    {
        Assertions.assertEquals("Michael Schukat", softwareEng.getLecturerName());
    }
}

