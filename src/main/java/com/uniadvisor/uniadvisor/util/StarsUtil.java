package com.uniadvisor.uniadvisor.util;

import java.util.List;

public class StarsUtil {
    public static float meanRating(List<Integer> ratingsList){
        float sum = 0;
        for(int e : ratingsList) {
            sum+=e;
        }

        return sum/ratingsList.size();
    }
    public static int closestRating(List<Integer> ratingsList){
        float sum = 0;
        for(int e : ratingsList) {
            sum+=e;
        }

        return Math.round(sum/ratingsList.size());
    }
}
