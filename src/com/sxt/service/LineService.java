package com.sxt.service;

import java.util.List;

import com.sxt.vo.Line;

public interface LineService {
	public boolean addLine(Line line) throws Exception;
	public List<Line> findAll() throws Exception;
	public boolean deleteByt_Id(String t_Id) throws Exception;
	public Line findt_Id(String t_id) throws Exception;

}
