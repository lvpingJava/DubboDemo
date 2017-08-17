package com.lp.demo.service.impl;

import com.lp.demo.api.CompanyApi;
import com.lp.demo.bean.CompanyBean;
import org.springframework.stereotype.Service;

/**
 * Created by lvping on 2017/7/25.
 */
@Service("companyApi")
public class ComApiImpl implements CompanyApi {

    @Override
    public CompanyBean getCompanyBean(CompanyBean companyBean) {
        CompanyBean companyBean1 = new CompanyBean ();
        companyBean1.setRemark("one piece");
        companyBean1.setName("海贼王");
        return companyBean1;
    }

    @Override
    public CompanyBean getCompanyInfo(CompanyBean companyBean) {
        CompanyBean companyBean1 = new CompanyBean ();
        companyBean1.setRemark("路飞");
        companyBean1.setName("船长");
        return companyBean1;
    }
}
