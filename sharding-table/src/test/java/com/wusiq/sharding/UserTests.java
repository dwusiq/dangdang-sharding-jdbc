package com.wusiq.sharding;

import com.alibaba.fastjson.JSON;
import com.wusiq.sharding.vo.ReqNewUserVO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingTableApplication.class)
@WebAppConfiguration
public class UserTests {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testNewUser() throws Exception {
        for (int i = 0; i < 4; i++) {
            ReqNewUserVO param = new ReqNewUserVO();
            param.setUserID(i);
            param.setUserName("aa");

            mockMvc.perform(MockMvcRequestBuilders.post("/user")
                    .content(JSON.toJSONString(param))
                    .contentType(MediaType.APPLICATION_JSON)
            );
        }
    }

    @Test
    public void testFindByUserID() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/user/1"));
        System.out.println("==============response:" + resultActions.andReturn().getResponse().getContentAsString());
    }

    @Test
    public void testUpdateUser() throws Exception {
        ReqNewUserVO param = new ReqNewUserVO();
        param.setUserID(1);
        param.setUserName("bb");

        mockMvc.perform(MockMvcRequestBuilders.put("/user")
                .content(JSON.toJSONString(param))
                .contentType(MediaType.APPLICATION_JSON)
        );
    }


    @Test
    public void testDeleteUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/user/2"));
    }

}
