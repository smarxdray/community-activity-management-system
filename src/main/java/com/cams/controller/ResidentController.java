package com.cams.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.cams.dao.domain.Resident;
import com.cams.dao.mapper.ResidentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/residents")
public class ResidentController {
    @Autowired
    ResidentMapper residentMapper;

    @RequestMapping("/")
    public List<Resident> greeting(@RequestParam(value="name", defaultValue="old") String name) {
        return residentMapper.selectList(null);
    }
}
