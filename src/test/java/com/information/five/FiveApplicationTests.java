package com.information.five;

import com.information.five.controller.LoginController;
import com.information.five.mapper.QuestionMapper;
import com.information.five.model.Question;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class FiveApplicationTests {

    @Autowired
    private Environment environment;

    @Autowired
    LoginController loginController;
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    @Autowired
    QuestionMapper questionMapper;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    void contextLoads() {


        String i = "0003";
        int c = Integer.parseInt(i);
        System.out.println(c);

//        String[] s = new String[]{"16010", "16542"};
//        List<Question> questionList = questionMapper.queryQusetinById(s);
//        System.out.println(questionList.size());
        //appService.getSystemAdminInfo("")
        //appService.queryAll("hm");
//		loginController.goLogin("18852762933","123456","127.0.0.1:8080");
//		Object o = testMapper.test("hm");
//
//		String dataPs = "$2y$10$JAJcmHySmsSiJUqeNKMl0u9L0VYCI228AorpVajEgXNZ..1.0JZ7i";
//
//		String password = "123456";
//
//		String newPs = dataPs.replace("$2y$","$2a$");
//
//		String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
//
//		BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
//
//	//	String mm_encode = bcp.encode(password);
//		if(bcp.matches(password,newPs)){
//			System.out.println("密码校验成功");
//		}else{
//			System.out.println("密码错误");
//		}


//		Boolean b = systemAdminService.getSystemAdminInfo("18852762933","123456","hm");

//		List<Goods> list = testMapper.test2();
//		System.out.println(list);


    }

}
