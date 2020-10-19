package com.rewardCentral.rewardCentral;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Locale;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestRewardCentralControllerIT {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAttractionRewardPoints_forUUID_OkIsReturn() throws Exception {
        //GIVEN : for a UUID

        Locale.setDefault(Locale.US);
        UUID userUUID = UUID.randomUUID();
        String userId = userUUID.toString();
        UUID attractionUUID = UUID.randomUUID();
        String attractionId = attractionUUID.toString();

        //WHEN call Controller
        //THEN return is OK
        mockMvc.perform(get("/getAttractionRewardPoints?attractionId="+attractionId+"&userId=" + userId))
                .andExpect(status().isOk());
    }
    @Test
    public void getAttractionRewardPoints_forIncorrectUUID_errorIsReturn() throws Exception {
        //GIVEN : for a UUID

        Locale.setDefault(Locale.US);

        String userId = "123456790";
        String attractionId = "123456790";

        //WHEN call Controller
        //THEN return is OK
        mockMvc.perform(get("/getAttractionRewardPoints?attractionId="+attractionId+"&userId=" + userId))
                .andExpect(status().isNotAcceptable());
    }
}
