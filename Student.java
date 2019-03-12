package com.atalkumar;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student st) {
        if (this.cgpa > st.cgpa) {
            return 1;
        } else if (this.cgpa == st.cgpa) {
            int res = this.name.compareTo(st.name);
            if (res > 0) return 1;
            if (res < 0) return -1;
            else return 0;
        } else {
            return -1;
        }

    }
}
