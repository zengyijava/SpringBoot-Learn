package com.jk.mybatis;

import com.jk.mybatis.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
@RunWith(SpringRunner.class)
class ApplicationTests {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    void test() {
        System.out.println(studentMapper.selectAllStudent());
    }

}
