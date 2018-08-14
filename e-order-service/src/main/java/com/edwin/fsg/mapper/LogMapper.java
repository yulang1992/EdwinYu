package com.edwin.fsg.mapper;

import java.util.Map;

import com.edwin.fsg.model.MLog;
import com.github.pagehelper.Page;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public interface LogMapper {
	
	void insertLog(MLog log);
	Page<MLog> findPage(Map<String, Object> map);
	MLog getById(Long id);
}
