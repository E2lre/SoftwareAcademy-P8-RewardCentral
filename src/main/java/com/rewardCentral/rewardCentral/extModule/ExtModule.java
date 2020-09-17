package com.rewardCentral.rewardCentral.extModule;

import rewardCentral.RewardCentral;

import java.util.UUID;

public interface ExtModule {
    public RewardCentral getRewardCentral();
    public int getAttractionRewardPoints(UUID attractionId, UUID userId);
}
