package com.lp.demo.dao;

import java.util.List;
import java.util.Map;

import com.lp.demo.entity.Hello;

public interface IHelloDao {
	 public List<Hello> queryHello(Map<String, Object> map);
}
