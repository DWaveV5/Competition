package com.kuang.pojo;

public class Takein {
    private int groupid;
    private String cname;
    private String upnumber;
    private int teacherid;
    private int projectid;
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getUpnumber() {
        return upnumber;
    }

    public void setUpnumber(String upnumber) {
        this.upnumber = upnumber;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    @Override
    public String toString() {
        return "Takein{" +
                "groupid=" + groupid +
                ", cname='" + cname + '\'' +
                ", upnumber='" + upnumber + '\'' +
                ", teacherid=" + teacherid +
                ", projectid=" + projectid +
                '}';
    }
}
