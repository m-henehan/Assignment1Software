import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class testClassJunit {
    ArrayList<String> courses = new ArrayList<String>(){
        {
            add("Computer Science");
        }
    };

    ArrayList<String> modules = new ArrayList<String>(){
        {
            add("Software Engineering");
            add("Professional Skills");
        }
    };

    studentClass maria = new studentClass("Maria Henehan", 21, DateTime.parse("06/02/2001", DateTimeFormat.forPattern("dd/MM/yyyy")),"19382053", courses, modules);
    @Test
    public void testStudent()
    {
        Assertions.assertEquals("MariaHenehan21", maria.getUsername());
    }
}
