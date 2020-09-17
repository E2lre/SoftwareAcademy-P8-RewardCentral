package com.rewardCentral.rewardCentral.extModule;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import rewardCentral.RewardCentral;

import java.util.UUID;

//@Repository
@Configuration
public class ExtModuleImpl implements  ExtModule {
    private static RewardCentral rewardCentral = new RewardCentral();

    @Override
    public RewardCentral getRewardCentral(){
        //return new RewardCentral();
        return rewardCentral;
    }

    @Override
    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
        return rewardCentral.getAttractionRewardPoints(attractionId,userId);
    }

}
