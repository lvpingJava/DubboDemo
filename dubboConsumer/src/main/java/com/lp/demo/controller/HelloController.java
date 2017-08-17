package com.lp.demo.controller;


import com.lp.demo.api.CompanyApi;
import com.lp.demo.api.School;
import com.lp.demo.api.UserApi;
import com.lp.demo.bean.CompanyBean;
import com.lp.demo.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

@Controller
public class HelloController {
	@Resource
	private UserApi userApi;

    @Resource
    private CompanyApi companyApi;

    @Resource
    private  School school;

    @RequestMapping(value="/welcome")
    public String printWelcome(ModelMap model) {
		UserBean userben=userApi.getUserBean(new UserBean());
        CompanyBean companyBean=companyApi.getCompanyBean(new CompanyBean());
        String school1=school.getT();
        model.addAttribute("a", userben.getUserName());
        model.addAttribute("b", companyBean.getName());
        model.addAttribute("c", companyBean.getRemark());
        model.addAttribute("d", school1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "index";
    }
	
}
