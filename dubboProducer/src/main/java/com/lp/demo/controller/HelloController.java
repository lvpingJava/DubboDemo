package com.lp.demo.controller;

import com.lp.demo.api.UserApi;
import com.lp.demo.bean.UserBean;
import com.lp.demo.entity.Hello;
import com.lp.demo.service.IHelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
	
	@Resource 
	private IHelloService helloService;

	@Resource
	private UserApi userApi;
	
	@RequestMapping(value="/welcome")
    public String printWelcome(ModelMap model) {
		UserBean userBean=userApi.getUserBean(new UserBean());
        model.addAttribute("message", userBean.getUserName()+"服务提供方启动成功");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "index";
    }
	
	 @RequestMapping(value="/getHello")
	 public String getHello(ModelMap model) {
		Map<String, Object> map=new HashMap<>();
		map.put("name", "青青");
		List<Hello> listHello= helloService.queryHello(map);
		model.addAttribute("listHello",listHello.get(0));
        return "hello";
    }
}
