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
@RequestMapping("/api")
public class PachonngController {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/annual")
    public List<Map<String, Object>> annual() {
        String sql = " select * from annual";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/average")
    public List<Map<String, Object>> average() {
        String sql = " select * from average";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/basicinfo")
    public List<Map<String, Object>> basicinfo() {
        String sql = " select * from basicinfo";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/fenjia")
    public List<Map<String, Object>> fenjia() {
        String sql = " select * from fenjia";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/fivemoneyflow")
    public List<Map<String, Object>> fivemoneyflow() {
        String sql = " select * from fivemoneyflow";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/fluctuaion")
    public List<Map<String, Object>> fluctuaion() {
        String sql = " select * from fluctuaion";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/jishumian")
    public List<Map<String, Object>> jishumian() {
        String sql = " select * from jishumian";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/oips")
    public List<Map<String, Object>> oips() {
        String sql = " select * from oips";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/samekind")
    public List<Map<String, Object>> samekind() {
        String sql = " select * from samekind";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/stagerise")
    public List<Map<String, Object>> stagerise() {
        String sql = " select * from stagerise";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/todaymoneyflow")
    public List<Map<String, Object>> todaymoneyflow() {
        String sql = " select * from todaymoneyflow";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

}
