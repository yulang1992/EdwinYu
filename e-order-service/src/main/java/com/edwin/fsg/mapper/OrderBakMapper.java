package com.edwin.fsg.mapper;

import com.edwin.fsg.model.OrderBak;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public interface OrderBakMapper extends BaseMapper<OrderBak,Long> {

	void insertOrderBak(OrderBak orderBak);

}
