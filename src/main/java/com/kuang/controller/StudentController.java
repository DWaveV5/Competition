package com.kuang.controller;

import com.kuang.pojo.Student;
import com.kuang.pojo.Takein;
import com.kuang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController  {
    @Autowired
    StudentService studentService;
    //学生点击点击报名
    @GetMapping("/studentin/{studentid}")
    public Student studentin(@PathVariable("studentid") String id){
        return studentService.selectstudentbyid(id);
    }
    //报名学生点击添加队员
    @GetMapping("/jonteammate/{studentid}")
    public String jonteammate(@PathVariable("studentid") String id, Model model){
        Student student=studentService.selectstudentbyid(id);
        if(student==null){
            return "该学号不存在";
        }else{
            model.addAttribute("student",student);
            return "查询成功对象存入model,student中";
        }
    }
    //确认提交项目申请,传入一个项目对象,点击提交
    @GetMapping("/takenin")
    public String takenin(){
        Takein takein =new Takein();
        takein.setCname("论坛系统");
        Student[] students=new Student[3];
        students[0]=new Student();
        students[1]=new Student();
        students[2]=new Student();
        students[0].setStudentname("丁1");
        students[1].setStudentname("丁2");
        students[2].setStudentname("丁3");
        takein.setStudents(students);
        studentService.addtakein(takein);
        return "提交成功";
    }
}
