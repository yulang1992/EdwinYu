package com.edwin.fsg.service.impl;
import com.edwin.fsg.model.OrderLog;
import com.edwin.fsg.service.IOrderLogService;
import com.alibaba.dubbo.config.annotation.Service;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 订单操作日志 用于标示订单的所有详细操作记录 服务实现类
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
@Service
public class OrderLogServiceImpl  implements IOrderLogService {

	@Override
	public OrderLog getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderLog> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
