package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import  org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by acer pc on 25-04-2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)

public class EmployeeDetailsIntegrationTest {

    private MockMvc mockMvc;

    @Test
    public void giveServerUp_WhenSendRequest_ThenGetReponseFromService() throws Exception {

        mockMvc.perform(get("/company/empdetails"))
                        .andExpect(status().isOk())     ;
    }
}
