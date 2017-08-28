package com.sxt.dao;

import java.util.List;

import com.sxt.vo.TrainInfo;

public interface TrainInfoDao {
	public boolean addTrain(TrainInfo traininfo) throws  Exception;
	public List<TrainInfo> findAll() throws Exception;
	public boolean deleteByName(String name) throws Exception;
	public TrainInfo findByName(String name) throws Exception;
	public TrainInfo findByt_id(int t_id) throws Exception;
}
