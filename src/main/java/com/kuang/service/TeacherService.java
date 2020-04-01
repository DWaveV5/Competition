package com.kuang.service;

import com.kuang.mapper.TeacherMapper;
import com.kuang.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    public List<Project> tealist(int teacherid) {
        return teacherMapper.tealist(teacherid);
    }

    public void startcom(int projectid) {
        teacherMapper.startcom(projectid);
    }

    public List<Project> started() {
        return teacherMapper.started();
    }
}
