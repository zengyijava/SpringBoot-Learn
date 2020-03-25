package com.jk.mybatis.service;

import com.jk.mybatis.bean.Student;
import com.jk.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional//开启事务
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    //@Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }
}

