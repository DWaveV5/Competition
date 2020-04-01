package com.kuang.mapper;

import com.kuang.pojo.Student;
import com.kuang.pojo.Takein;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {

    Student selectstudentbyid(String id);

    void addtakein(Takein takein);

    void insertStudentIntoTeam(Student student);
}
