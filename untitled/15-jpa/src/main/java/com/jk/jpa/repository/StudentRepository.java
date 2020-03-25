package com.jk.jpa.repository;

import com.jk.jpa.bean.Student;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Long> {
    public List<Student> findAll();

}
