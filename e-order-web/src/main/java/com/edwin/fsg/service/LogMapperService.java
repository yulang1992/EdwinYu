package com.edwin.fsg.service;

import java.util.Map;

import com.edwin.fsg.model.MLog;
import com.github.pagehelper.Page;

/**
 * <p>
 * 日志服务类
 * </p>
 *
 * @author edwin yu
 * @since 2018-07-10
 */
public interface LogMapperService {
	
	Integer insertLog(MLog log);
	Page<MLog> findPage(Map<String, Object> map);
	MLog getById(Long id);
   
	
}
