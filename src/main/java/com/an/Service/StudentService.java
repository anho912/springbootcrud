package com.an.Service;

import com.an.entity.Student;

import java.util.Collection;

/**
 * @Author: anhao
 * @Date:2018/12/2 11:19
 */
public interface StudentService {

    Collection<Student> getAll();

    Student getById(int id);

    Collection<Student> deleteById(int id);
}
