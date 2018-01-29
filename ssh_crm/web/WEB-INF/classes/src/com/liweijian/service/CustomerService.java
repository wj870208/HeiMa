package com.liweijian.service;

import com.liweijian.domain.Customer;
import com.liweijian.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 23:45 2018/1/25 0025
 */
public interface CustomerService {
    //获取页面数据
    PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
    //保存客户
    void save(Customer customer);
    //根据id查询客户
    Customer getCustomerById(Long cust_id);
    //更新客户
    void update(Customer customer);
}
