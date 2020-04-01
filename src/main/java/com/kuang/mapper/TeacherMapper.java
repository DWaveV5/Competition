package com.kuang.mapper;

import com.kuang.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    List<Project> tealist(int teacherid);

    void startcom(int projectid);

    List<Project> started();
}
