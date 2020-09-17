package com.rewardCentral.rewardCentral.controler;

import com.rewardCentral.rewardCentral.controler.exceptions.UUIDException;
import com.rewardCentral.rewardCentral.service.RewardCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class RewardCentralControler {
    @Autowired
    private RewardCentralService rewardCentralService;

    @GetMapping(value = "getAttractionRewardPoints")
    @ResponseStatus(HttpStatus.OK)
    public int getAttractionRewardPoints (@RequestParam String attractionId, @RequestParam String userId) throws UUIDException {
        try {
            UUID attractionIdUUID = UUID.fromString(attractionId);
            UUID userIdUUID = UUID.fromString(userId);
            return rewardCentralService.getAttractionRewardPoints(attractionIdUUID,userIdUUID);
        } catch (Exception e){
            throw new UUIDException("UUID input error: attractionId = "+ attractionId + "  userId = " + userId + "  message :" + e.getMessage());
        }

    }
}
