package org.example;

import org.example.studentClass;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class testStudentClassJunit {
    ArrayList<String> courses = new ArrayList<>(){
        {
            add("Computer Science");
        }
    };

    ArrayList<String> modules = new ArrayList<>(){
        {
            add("Software Engineering");
            add("Professional Skills");
        }
    };

    studentClass maria = new studentClass("Maria Henehan", 21, DateTime.parse("06/02/2001", DateTimeFormat.forPattern("dd/MM/yyyy")),"19382053", courses, modules);
    @Test
    public void testStudent()
    {
        Assertions.assertEquals("Maria Henehan", maria.getName());
        Assertions.assertEquals(21, maria.getAge());
        Assertions.assertEquals(DateTime.parse("06/02/2001", DateTimeFormat.forPattern("dd/MM/yyyy")), maria.getDOB());
        Assertions.assertEquals("19382053", maria.getID());
        Assertions.assertEquals("MariaHenehan21", maria.getUsername());
        Assertions.assertEquals(courses, maria.getCourses());
        Assertions.assertEquals(modules, maria.getModules());
        modules.add("Machine Learning");
        maria.addModules("Machine Learning");
        Assertions.assertEquals(modules, maria.getModules());
    }
}
