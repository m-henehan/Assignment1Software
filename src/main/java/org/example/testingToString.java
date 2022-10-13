package org.example;

import org.example.courseProgrammeClass;
import org.example.lecturerClass;
import org.example.moduleClass;
import org.example.studentClass;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.ArrayList;

public class testingToString {
    public static void main(String[] args){

        DateTime startDate = DateTime.parse("01/09/2022", DateTimeFormat.forPattern("dd/MM/yyyy"));
        DateTime endDate = DateTime.parse("05/12/2022", DateTimeFormat.forPattern("dd/MM/yyyy"));

        ArrayList<String> modules = new ArrayList<>() {
            {
                add("Software Engineering");
                add("Professional Skills");
            }
        };

        ArrayList<String> students = new ArrayList<>() {
            {
                add("Maria Henehan");
                add("Christina Heaney");
                add("Seamus Dewar");
            }
        };

        ArrayList<String> courses = new ArrayList<>(){
            {
                add("Computer Science");
            }
        };

        courseProgrammeClass compSci = new courseProgrammeClass("Computer Science", students, modules, startDate, endDate);

        lecturerClass emily = new lecturerClass("Emily Metadjer", 25, DateTime.parse("09/10/97", DateTimeFormat.forPattern("dd/MM/yyyy")), "19472947", modules);

        moduleClass softwareEng = new moduleClass("Software Engineering", "Michael Schukat", "ct417", students, courses);

        studentClass maria = new studentClass("Maria Henehan", 21, DateTime.parse("06/02/2001", DateTimeFormat.forPattern("dd/MM/yyyy")),"19382053", courses, modules);

        System.out.println(compSci);
        System.out.println(emily);
        System.out.println(softwareEng);
        System.out.println(maria);
    }
}
