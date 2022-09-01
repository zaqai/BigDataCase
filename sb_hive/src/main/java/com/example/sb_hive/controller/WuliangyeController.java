package com.example.sb_hive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: 周绮
 * @Version: v0.1
 * @Date: 2022/8/27
 * @Description: 使用JdbcTemplate
 **/
@RestController
@CrossOrigin
@RequestMapping("/wuliangye")
public class WuliangyeController {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/day")
    public List<Map<String, Object>> listDay() {
        String sql = " select * from wuliangye_day_k_csv";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/month")
    public List<Map<String, Object>> listMonth() {
        String sql = " select * from wuliangye_month_k_csv";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

}
