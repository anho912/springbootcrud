package com.an.Service;

import com.an.dao.StudentDAO;
import com.an.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @Author: anhao
 * @Date:2018/12/2 11:19
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Collection<Student> getAll() {
        return studentDAO.getAll();
    }

    @Override
    public Student getById(int id) {
        return studentDAO.getById(id);
    }

    @Override
    public Collection<Student> deleteById(int id) {
        return studentDAO.deleteById(id);
    }
}
