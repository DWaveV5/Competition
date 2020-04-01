package com.kuang.mapper;

import com.kuang.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProjectMapper {
    List<Project> UserList();

    Project SelectById(int id);

    int addProject(Project project);

    int updateProject(Project project);

    int deleteProject(int id);

    List<Project> academylist();

    public void academypass(int state,int id);

    public void academymodify(String str,int id);

    List<Project> listglk(int state);

    void glkpass(int number, double getmoney, int ifpinggu, double projectid);

    void glkmodify(String modifyidea, int i, int projectid);

    void glkback(int projectid);
}
