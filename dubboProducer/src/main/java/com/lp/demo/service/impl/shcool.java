package com.lp.demo.service.impl;

import com.lp.demo.api.School;
import org.springframework.stereotype.Service;

/**
 * Created by lvping on 2017/8/2.
 */
@Service("school")
public class shcool  implements School{
    @Override
    public String getT() {
        return "1";
    }
}
