package com.sxt.service;

import java.util.List;

import com.sxt.vo.TrainInfo;

public interface TrainInfoService {
	 public boolean addTrain(TrainInfo traininfo) throws Exception;
	 public List<TrainInfo> findAll() throws Exception ;
	 public boolean deleteByName(String name) throws Exception;
	 public TrainInfo findByName(String name) throws Exception;
}
