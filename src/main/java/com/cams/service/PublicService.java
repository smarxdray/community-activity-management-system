package com.cams.service;

import com.cams.dao.domain.Activity;
import com.cams.dao.domain.Plcae;
import com.cams.dao.domain.User;

import java.util.List;

public interface PublicService {
    User addUser(User user);

    List<Plcae> selectPlace();

    List<Activity> selectActivity(Activity activity);

    User updateUser(User user);
}
