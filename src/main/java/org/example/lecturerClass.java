package org.example;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class lecturerClass {
    private String name;
    private Integer age;
    private DateTime DOB;
    private String ID;
    private String username;
    ArrayList<String> modules;

    public lecturerClass(String name, Integer age, DateTime DOB, String ID, ArrayList<String> modules)
    {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.modules = modules;
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

    @Override
    public String toString()
    {
        String lecturer = name + ", " +age + ", " + DOB + ", " + ID + ", " + modules;
        return lecturer;
    }
}

