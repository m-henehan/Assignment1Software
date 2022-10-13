package org.example;

import org.example.lecturerClass;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class testLecturerClassJunit {
    ArrayList<String> courses = new ArrayList<>() {
        {
            add("Computer Science");
        }
    };

    ArrayList<String> modules = new ArrayList<>() {
        {
            add("Software Engineering");
            add("Professional Skills");
        }
    };

    lecturerClass emily = new lecturerClass("Emily Metadjer", 25, DateTime.parse("09/10/97", DateTimeFormat.forPattern("dd/MM/yyyy")), "19472947", modules);

    @Test
    public void testLecturerUsername()
    {
        Assertions.assertEquals("Emily Metadjer", emily.getName());
        Assertions.assertEquals("EmilyMetadjer25", emily.getUsername());
        Assertions.assertEquals(25, emily.getAge());
        Assertions.assertEquals(DateTime.parse("09/10/97", DateTimeFormat.forPattern("dd/MM/yyyy")), emily.getDOB());
        Assertions.assertEquals("19472947", emily.getID());
        Assertions.assertEquals(modules, emily.getModules());
        modules.add("Machine Learning");
        emily.addModules("Machine Learning");
        Assertions.assertEquals(modules, emily.getModules());
    }
}
