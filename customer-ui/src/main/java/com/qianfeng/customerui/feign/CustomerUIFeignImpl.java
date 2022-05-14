package com.qianfeng.customerui.feign;

import com.qianfeng.goodscommons.pojo.Customer;
import com.qianfeng.goodscommons.vo.ResultVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerUIFeignImpl implements CustomerUIFeign {

    @Override
    public List<Customer> getCustomerList() {
        return null;
    }

    @Override
    public ResultVo getCustomerDetail(Integer id) {
        return ResultVo.error("feign的服务降级响应");
    }
}
