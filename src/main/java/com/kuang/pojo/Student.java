package com.kuang.pojo;

public class Student {
    private int joingroupid;
    private String studentid;
    private String studentname;
    private int studentage;
    private String studentsex;
    private String studentlevel;
    private String studentclass;

    public int getJoingroupid() {
        return joingroupid;
    }

    public void setJoingroupid(int joingroupid) {
        this.joingroupid = joingroupid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex;
    }

    public String getStudentlevel() {
        return studentlevel;
    }

    public void setStudentlevel(String studentlevel) {
        this.studentlevel = studentlevel;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "joingroupid=" + joingroupid +
                ", studentid='" + studentid + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentage=" + studentage +
                ", studentsex='" + studentsex + '\'' +
                ", studentlevel='" + studentlevel + '\'' +
                ", studentclass='" + studentclass + '\'' +
                '}';
    }
}
