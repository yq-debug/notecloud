package com.service.serviceImpl;

import com.entity.Condition;
import com.entity.admin.AdminData;
import com.mapper.AdminMapper;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Description TODO
 * @Author yq
 * @Date 2020/4/13 22:02
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    /**
     * 获取账户列表
     *
     * @param collection
     * @return
     */
    @Override
    public List<AdminData> getAccountList(Condition collection) {
        List<AdminData> adminDataList = adminMapper.getAccountList(collection);
        return adminDataList;
    }

    /**
     * 获取账户总数
     * @param condition
     * @return
     */
    @Override
    public Integer getAccountCount(Condition condition) {
        Integer count = adminMapper.getAccountCount(condition);
        return count;
    }
}
