package com.information.five;

import com.information.five.controller.LoginController;
import com.information.five.mapper.QuestionMapper;
import com.information.five.model.Question;
import com.information.five.model.SystemAdmin;
import com.information.five.util.DbUtil;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class FiveApplicationTests {







    @Test
    void contextLoads() {






//		Boolean b = systemAdminService.getSystemAdminInfo("18852762933","123456","hm");

//		List<Goods> list = testMapper.test2();
//		System.out.println(list);

        String db = DbUtil.getDb("218.92.167.118:8089");
        System.out.printf(db+"111111111111111");

    }

}
