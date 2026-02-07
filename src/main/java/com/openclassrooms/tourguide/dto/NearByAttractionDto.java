package com.openclassrooms.tourguide.dto;


public record NearByAttractionDto(
    String attractionName,
    double attractionLatitude,
    double attractionLongitude,
    double userLocationLatitude,
    double userLocationLongitude,
    double distanceBetweenAttractionAndUserLocation,
    int rewardPoints
) {}
