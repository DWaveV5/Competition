package com.kuang.controller;

import com.kuang.mapper.ProjectMapper;
import com.kuang.pojo.Project;
import com.kuang.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/UserList")
    public List<Project> UserList(){
        List<Project> projects=projectService.UserList();
        for(Project project : projects){
            System.out.println(project.toString());
        }
        return projects;
    }
    @GetMapping("/SelectById/{id}")
    public Project SelectById(@PathVariable("id") int id){
        Project project=projectService.SelectById(id);
        System.out.println(project.toString());
        return project;
    }
    @GetMapping("/addProject")
    public int addProject(){
        Project project=new Project();
        project.setDepartment("软件学院");
        project.setProjectname("test2");
        project.setTdate(new Date());
        int result=projectService.addProject(project);
//        System.out.println("result="+result);
        return result;
    }
    //传对象修改
    @GetMapping("/updateProject")
    public String updateProject(){
        Project project=new Project();
        project.setDepartment("test");
        project.setProjectname("test2");
        project.setTdate(new Date());
        project.setTeacherid(4);
        project.setId(4);
        project.setModifyidea("添加修改意见");
        projectService.updateProject(project);
        return "OK";
    }
    @GetMapping("/deleteProject/{id}")
    public String deleteProject(@PathVariable("id") int id){
        projectService.deleteProject(5);
        return "deleteOK";
    }
    //点击提交项目
    @GetMapping("/submit")
    public int submitProject(){
        Project project=new Project();
        project.setState(2);
        int result=projectService.addProject(project);
        return result;
    }
    //点击保存项目
    @GetMapping("/save")
    public int saveProject(){
        Project project=new Project();
        project.setState(1);
        int result=projectService.addProject(project);
        return result;
    }
    //学院审批列表
    @GetMapping("/academylist")
    public List<Project> academylist(){
        return projectService.academylist();
    }
    //通过学院审核
    @GetMapping("/academypass/{id}")
    public String academypass(@PathVariable("id") int id){
        int state=5;
        projectService.academypass(state,id);
        return "通过申请";
    }
    //提出修改意见
    @GetMapping("/academymodify/{str}/{id}")
    public String academymodify(@PathVariable("str") String str,@PathVariable("id") int id){
        int state=3;
        projectService.academymodify(str,id);
        return "返回修改";
    }
    //被院领导驳回
    @GetMapping("/academyreturn/{id}")
    public String academyreturn(@PathVariable("id") int id){
        int state=4;
        projectService.academypass(state,id);
        return "被院领导驳回";
    }
    //竞赛管理科界面列表
    @GetMapping("/listglk")
    public List<Project> listglk(){
        //查询所有被学院通过审批的
        return projectService.listglk();
    }
    //竞赛管理科通过学院项目，并给与金额
    @GetMapping("/glkpass/{getmoney}/{ifpinggu}/{projectid}")
    public String glkpass(@PathVariable("getmoney")double getmoney,@PathVariable("ifpinggu")int ifpinggu,@PathVariable("projectid")double projectid){
        int number=1;
        projectService.glkpass(number,getmoney,ifpinggu,projectid);
        return "通过成功";
    }
    //竞赛管理科要求学院项目修改，并给出修改意见
    @GetMapping("/glkmodify/{modifyidea}/{projectid}")
    public void glkmodify(@PathVariable("modifyidea") String modifyidea,@PathVariable("projectid") int projectid){
        projectService.glkmodify(modifyidea,projectid);
    }
    //竞赛管理科驳回学院项目
    @GetMapping("/glkback/{projectid}")
    public String glkback(@PathVariable("projectid") int projectid){
        projectService.glkback(projectid);
        return "驳回成功";
    }

}
