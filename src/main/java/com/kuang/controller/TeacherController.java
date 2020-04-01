package com.kuang.controller;

import com.kuang.pojo.Project;
import com.kuang.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    //负责教师当前能发起比赛的列表
    @GetMapping("/tealist/{teacherid}")
    public List<Project> tealist(@PathVariable("teacherid") int teacherid){
        return teacherService.tealist(teacherid);
    }
    //负责教师发起比赛
    @GetMapping("/startcom/{projectid}")
    public String startcom(@PathVariable("projectid") int projectid){
        teacherService.startcom(projectid);
        return "比赛发起成功";
    }
    //所有负责教师已经发起的比赛
    @GetMapping("/started")
    public List<Project> started(){
        return teacherService.started();
    }
}
