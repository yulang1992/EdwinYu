//package com.edwin.fsg.service.impl;
//
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.util.Assert;
//import com.alibaba.dubbo.config.annotation.Service;
//import com.edwin.fsg.mapper.LogMapper;
//import com.edwin.fsg.model.MLog;
//import com.edwin.fsg.service.LogMapperService;
//import com.github.pagehelper.Page;
//
//@Service
//@Transactional
//public class LogMapperServiceImpl implements LogMapperService{
//
//	private static final Logger logger =LoggerFactory.getLogger(LogMapperServiceImpl.class);
//	
//	@Autowired
//	private LogMapper logMapper;
//	
//	public void insertLog(MLog log) {
//		Assert.notNull(log, "日志信息数据异常！");
//		logger.info("log----->: {}",log);
//		logMapper.insertLog(log);
//	}
//
//	@Override
//	public Page<MLog> findPage(Map<String, Object> map) {
//		return logMapper.findPage(map);
//	}
//
//	@Override
//	public MLog getById(Long id) {
//		Assert.notNull(id, "ID参数不能为空！");
//		return logMapper.getById(id);
//	}
//
//}
