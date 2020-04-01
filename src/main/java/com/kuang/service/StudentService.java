package com.kuang.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.kuang.mapper.StudentMapper;
import com.kuang.pojo.Student;
import com.kuang.pojo.Takein;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student selectstudentbyid(String id) {
        return studentMapper.selectstudentbyid(id);
    }

    public void addtakein(Takein takein) {
        studentMapper.addtakein(takein);
//        System.out.println("项目id:"+takein.getGroupid());
        //将报名的学生插入到比赛表中
        for(int i=0;i<takein.getStudents().length;i++){
//            takein.getStudents()[i].setStudentid("20161915012"+i);
            takein.getStudents()[i].setJoingroupid(takein.getGroupid());
            studentMapper.insertStudentIntoTeam(takein.getStudents()[i]);
        }
    }
}
