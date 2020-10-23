package com.rewardCentral.rewardCentral.controler;

import com.rewardCentral.rewardCentral.controler.exceptions.UUIDException;
import com.rewardCentral.rewardCentral.service.RewardCentralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class RewardCentralControler {
    private Logger logger = LoggerFactory.getLogger(RewardCentralControler.class);

    @Autowired
    private RewardCentralService rewardCentralService;

    /**
     * give attraction reward points
     * @param attractionId atraction id in UUID format
     * @param userId user id in UUID format
     * @return reward point for the attraction
     * @throws UUIDException if id are not UUID
     */
    @GetMapping(value = "getAttractionRewardPoints")
    @ResponseStatus(HttpStatus.OK)
    public int getAttractionRewardPoints (@RequestParam String attractionId, @RequestParam String userId) throws UUIDException {
        try {
            logger.debug("Start getAttractionRewardPoints for attractionId : " + attractionId +" et userId : " +userId );
            UUID attractionIdUUID = UUID.fromString(attractionId);
            UUID userIdUUID = UUID.fromString(userId);
            return rewardCentralService.getAttractionRewardPoints(attractionIdUUID,userIdUUID);
        } catch (Exception e){
            throw new UUIDException("UUID input error: attractionId = "+ attractionId + "  userId = " + userId + "  message :" + e.getMessage());
        }

   }

}
