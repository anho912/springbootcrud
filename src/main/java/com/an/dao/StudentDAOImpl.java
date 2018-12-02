package com.an.dao;

import com.an.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: anhao
 * @Date:2018/12/2 11:17
 */
@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {

    private Map<Integer, Student> map = new HashMap<Integer, Student>() {{
        put(1, new Student(1, "张三", 12));
        put(2, new Student(2, "李四", 15));
    }};

    @Override
    public Collection<Student> getAll() {
        return map.values();
    }

    @Override
    public Student getById(int id) {
        return map.get(id);
    }

    @Override
    public Collection<Student> deleteById(int id) {
        map.remove(id);
        return map.values();
    }
}
