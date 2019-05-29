package com.cams.service;

import com.cams.dao.domain.Activity;

import java.util.List;

public interface SponsorService {
    Activity addActivity(Activity activity);

    List<Activity> selectActivity(Activity activity) ;

    int deleteActivity(int id);

    int updateActivity(Activity activity);


    //xml
    int  updateActivityxml(Activity activity);
}
