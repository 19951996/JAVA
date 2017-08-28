package com.sxt.serviceImpl;

import java.util.List;

import com.sxt.dao.impl.TrainInfoDaoImpl;
import com.sxt.service.TrainInfoService;
import com.sxt.vo.TrainInfo;

public class TrainInfoServiceImpl implements TrainInfoService{
      TrainInfoDaoImpl train = new  TrainInfoDaoImpl();
	public boolean addTrain(TrainInfo traininfo) throws Exception {
		return train.addTrain(traininfo);
	}
	
	public List<TrainInfo> findAll() throws Exception {
		return train.findAll();
	}

	public boolean deleteByName(String name) throws Exception {
		return train.deleteByName(name);
	}
	
	public TrainInfo findByName(String name) throws Exception {
		return train.findByName(name);
	}

	
	public TrainInfo findByt_id(int t_id) throws Exception {	
		return train.findByt_id(t_id);
	}
	

}

