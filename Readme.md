# RewardCentral
API REST micro-service for TourGuide application to managing travel and attraction for a custumer.
RewardCentral manage Reward informations. 
This app use SPRINT BOOT, FeignClient.

## Getting Started

- Endpoint : http://localhost:8081/

## Prerequisites

- Java 1.8
- Spring Boot 2.2.6
- Gradle 2.2.5

# Installation

No Database creation needed:

To start the application start sub-micro-service with or without docker in build libs directories: 
- RewardCentral : java -jar rewardCentral-0.0.1-SNAPSHOT.jar


# Architecture Diagram
![ScreenShot](Architecture.png)

# URI
## get Attraction RewardGPoints
Example : 
http://localhost:8081/getAttractionRewardPoints?attractionId=123e4567-e89b-12d3-a456-426614174000&userId=123e4567-e89b-12d3-a456-426614174000
