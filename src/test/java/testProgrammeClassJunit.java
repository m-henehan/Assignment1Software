import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class testMProgrammeClassJunit {

    DateTime startDate = DateTime.parse("01/09/2022", DateTimeFormat.forPattern("dd/MM/yyyy"));
    DateTime endDate = DateTime.parse("05/12/2022", DateTimeFormat.forPattern("dd/MM/yyyy"));
    ArrayList<String> modules = new ArrayList<>(){
        {
            add("Software Engineering");
        }
    };

    ArrayList<String> students = new ArrayList<>(){
        {
            add("Maria Henehan");
            add("Christina Heaney");
            add("Seamus Dewar");
        }
    };

    courseProgrammeClass compSci = new courseProgrammeClass("Computer Science", students, modules, startDate, endDate);
    @Test
    public void testAddStudents()
    {
        compSci.addStudents("Heather O'Brien");
        students.add("Heather O'Brien");
        Assertions.assertEquals(students, compSci.getStudents());
    }

    @Test
    public void testCourseStartDate()
    {
        Assertions.assertEquals(startDate, compSci.getStartDate());
    }
}
