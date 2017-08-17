package com.lp.demo.service.impl;

import com.lp.demo.dao.IHelloDao;
import com.lp.demo.entity.Hello;
import com.lp.demo.service.IHelloService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class HelloService implements IHelloService{
	private IHelloDao helloDao;
	@Override
	public List<Hello> queryHello(Map<String, Object> map) {
		return helloDao.queryHello(map);
	}

}
