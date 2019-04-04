package com.cams.service.impl;

import com.cams.dao.domain.Resident;
import com.cams.dao.mapper.ResidentMapper;
import com.cams.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ResidentServiceImpl implements ResidentService {
    @Autowired
    ResidentMapper residentMapper;

    @Override
    public List<Resident> queryUsers() {
        return residentMapper.selectList(null);
    }
}
