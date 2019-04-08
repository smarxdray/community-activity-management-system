package com.cams.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cams.dao.domain.Resident;
import com.cams.dao.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface ResidentMapper extends BaseMapper<Resident> {
    int insertResident(User user);
}