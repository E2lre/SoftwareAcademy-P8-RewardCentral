package com.rewardCentral.rewardCentral.service;

import com.rewardCentral.rewardCentral.extModule.ExtModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RewardCentralServiceImpl implements RewardCentralService {

    @Autowired
    private ExtModule extModule;

    /**
     * give attraction reward points
     * @param attractionId attraction id in UUID format
     * @param userId user id in UUID format
     * @return reward points for attraction
     */
    @Override
    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {

        return extModule.getAttractionRewardPoints(attractionId,userId);
    }
}
