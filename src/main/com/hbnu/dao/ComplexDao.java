package com.hbnu.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexDao {

    private List<String> list;
    private Set<Integer> set;
    private Map<String,Integer> map;

    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
}
