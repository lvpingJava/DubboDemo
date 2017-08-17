package com.lp.demo.api;

import com.lp.demo.bean.CompanyBean;

/**
 * Created by lvping on 2017/7/21.
 */
public interface CompanyApi {
    CompanyBean getCompanyBean(CompanyBean companyBean);

    CompanyBean getCompanyInfo(CompanyBean companyBean);

}