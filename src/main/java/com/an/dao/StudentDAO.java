package com.an.dao;

import com.an.entity.Student;

import java.util.Collection;

/**
 * @Author: anhao
 * @Date:2018/12/2 11:16
 */
public interface StudentDAO {

    /**
     * 获取所有数据
     * @return
     */
    Collection<Student> getAll();

    Student getById(int id);

    Collection<Student> deleteById(int id);
}
