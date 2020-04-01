package com.kuang.service;

import com.kuang.mapper.ProjectMapper;
import com.kuang.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectMapper projectMapper;

    public List<Project> UserList(){
        return projectMapper.UserList();
    }

    public Project SelectById(int id){
        return projectMapper.SelectById(id);
    }
    public int addProject(Project project){
        return projectMapper.addProject(project);
    }

    public int updateProject(Project project){
        return projectMapper.updateProject(project);
    }

    public int deleteProject(int id){
        return projectMapper.deleteProject(id);
    }
    public List<Project> academylist(){
        return projectMapper.academylist();
    }
    public void academypass(int state,int id){
        projectMapper.academypass(state,id);
    }
    public void academymodify(String str,int id){
        projectMapper.academymodify(str,id);
    }
    public List<Project> listglk(){
        //学院通过的state为5
        int number=5;
        return projectMapper.listglk(number);
    }


    public void glkpass(int number, double getmoney, int ifpinggu, double projectid) {
        projectMapper.glkpass(number,getmoney,ifpinggu,projectid);
    }

    public void glkmodify(String modifyidea, int projectid) {
        int number=2;//修改状态为2
        projectMapper.glkmodify(modifyidea,projectid,number);
    }

    public void glkback(int projectid) {
        projectMapper.glkback(projectid);
    }
}
