package com.cams.service.impl;

import com.cams.dao.domain.Activity;
import com.cams.dao.domain.Plcae;
import com.cams.dao.domain.User;
import com.cams.dao.mapper.PublicMapper;
import com.cams.service.PublicService;
import com.cams.utils.VALUE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicServiceimpl implements PublicService {
    @Autowired
    PublicMapper publicMapper;
    @Override
    public User addUser(User user) {
        int lines = -1;
        switch (user.getRole()) {
            case VALUE.ROLE_ADMIN:
                lines = publicMapper.addadmin(user);
                break;
            case VALUE.ROLE_SPONSOR:
                lines = publicMapper.addsponsor(user);
                break;
            case VALUE.ROLE_COACH:
                lines = publicMapper.addCoach(user);
                break;
            case VALUE.ROLE_RESIDENT:
                lines=publicMapper.addResident(user);
            default: break;
        }
        if (lines == 1) return user;
        else return null;
    }

    @Override
    public List<Plcae> selectPlace() {
        List<Plcae> list=publicMapper.selectPlace();
        if (list==null) return null;
        else  return list;
    }

    @Override
    public List<Activity> selectActivity(Activity activity) {
        List<Activity> list=null;
        list=publicMapper.selectActivity(activity);
        if (list.size()==0) return null;
        else  return list;
    }

    @Override
    public User updateUser(User user) {
        int lines = -1;
        switch (user.getRole()) {
            case VALUE.ROLE_ADMIN:
                lines =publicMapper.updateAdmin(user);
                break;
            case VALUE.ROLE_SPONSOR:
                lines = publicMapper.updateSponsor(user);
                break;
            case VALUE.ROLE_COACH:
                lines = publicMapper.updateCoach(user);
                break;
            case VALUE.ROLE_RESIDENT:
                lines=publicMapper.updateResident(user);
            default: break;
        }
        if (lines ==1) return user;
        else return null;
    }
}
