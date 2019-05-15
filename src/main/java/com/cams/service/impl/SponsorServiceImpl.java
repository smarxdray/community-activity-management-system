package com.cams.service.impl;

import com.cams.dao.domain.Activity;
import com.cams.dao.mapper.SponsorMapper;
import com.cams.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class SponsorServiceImpl implements SponsorService {

    @Autowired
    SponsorMapper sponsorMapper;


    @Override
    public Activity addActivity(Activity activity) {
        int logo=0;
        logo=sponsorMapper.insert(activity);
        if(logo==0) return  null;
        else  return activity;

    }


    @Override
    public int updateActivity(Activity activity) {
        int logo=sponsorMapper.updateById(activity);
        System.out.println(logo);
        return logo;
    }

    @Override
    public List<Activity> selectActivity(Activity activity) {
        System.out.println("aaaaaaa");
        Map<String,Object> map=new HashMap<>();

        if (activity.getId()>0) {
            map.put("id",activity.getId());
            System.out.println(activity.getId());
        }


        if (activity.getType()>0) map.put("type",activity.getType());
        if (activity.getStatus()>0) map.put("status",activity.getStatus());

        if (activity.getPlace()>0) {
            int place=activity.getPlace();
            map.put("place",place);
            System.out.println(activity.getPlace()+"place");
        }


        if (activity.getSponsor()>0) {
            map.put("sponsor",activity.getSponsor());
            System.out.println(activity.getSponsor()+"spon");
        }


        if (activity.getCoach()>0) {
            map.put("coach",activity.getCoach());
            System.out.println(activity.getCoach()+"coach");
        }



        List<Activity> list=sponsorMapper.selectByMap(map);
        System.out.println(map);



        if (list==null) return null;
        else return list;

    }

    @Override
    public int deleteActivity(int id) {
        int logo=sponsorMapper.deleteById(id);
        return logo;
    }


    //xml

    @Override
    public int updateActivityxml(Activity activity) {
        int logo=0;
        logo=sponsorMapper.updateActivity(activity);
        if (logo==0) return 0;
        else return logo;
    }
}
