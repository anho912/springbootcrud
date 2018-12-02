package com.an.Controller;

import com.an.Service.StudentService;
import com.an.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author: anhao
 * @Date:2018/12/2 11:21
 */
@RestController(value = "v2")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Collection<Student> getAll() {
        return studentService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getById(@PathVariable("id") int id) {
        return studentService.getById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Collection<Student> deleteById(@PathVariable("id")int id){
        return studentService.deleteById(id);
    }
}