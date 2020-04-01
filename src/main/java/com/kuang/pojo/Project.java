package com.kuang.pojo;
import java.util.Date;
public class Project {
    private int id;
    private String department;
    private String projectname;
    private String maxlevel;
    private int  teacherid;
    private String phonenumber;
    private String groupnumber;
    private String peoplenumber;
    private String stage;
    private String awards;
    private String hope;
    private String introduce;
    private String flow;
    private String conditions;
    private int  state;
    private Date tdate;
    private String whost;
    private int  lastuseid;
    private String modifyidea;

    public String getModifyidea() {
        return modifyidea;
    }

    public void setModifyidea(String modifyidea) {
        this.modifyidea = modifyidea;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getWhost() {
        return whost;
    }

    public void setWhost(String whost) {
        this.whost = whost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getMaxlevel() {
        return maxlevel;
    }

    public void setMaxlevel(String maxlevel) {
        this.maxlevel = maxlevel;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(String groupnumber) {
        this.groupnumber = groupnumber;
    }

    public String getPeoplenumber() {
        return peoplenumber;
    }

    public void setPeoplenumber(String peoplenumber) {
        this.peoplenumber = peoplenumber;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getHope() {
        return hope;
    }

    public void setHope(String hope) {
        this.hope = hope;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }



    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }


    public int getLastuseid() {
        return lastuseid;
    }

    public void setLastuseid(int lastuseid) {
        this.lastuseid = lastuseid;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", projectname='" + projectname + '\'' +
                ", maxlevel='" + maxlevel + '\'' +
                ", teacherid=" + teacherid +
                ", phonenumber='" + phonenumber + '\'' +
                ", groupnumber='" + groupnumber + '\'' +
                ", peoplenumber='" + peoplenumber + '\'' +
                ", stage='" + stage + '\'' +
                ", awards='" + awards + '\'' +
                ", hope='" + hope + '\'' +
                ", introduce='" + introduce + '\'' +
                ", flow='" + flow + '\'' +
                ", conditions='" + conditions + '\'' +
                ", state=" + state +
                ", tdate=" + tdate +
                ", whost='" + whost + '\'' +
                ", lastuseid=" + lastuseid +
                ", modifyidea='" + modifyidea + '\'' +
                '}';
    }
}
