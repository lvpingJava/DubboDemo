package com.lp.demo.service;

import java.util.List;
import java.util.Map;

import com.lp.demo.entity.Hello;
public interface IHelloService {
        public List<Hello> queryHello(Map<String, Object> map);
}
