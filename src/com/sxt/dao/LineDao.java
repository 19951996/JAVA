package com.sxt.dao;

import java.util.List;

import com.sxt.vo.Line;

public interface LineDao {
		public List<Line> findStation() throws Exception; //��ѯ��ʼվ�յ�վ
		public boolean addLine(Line line) throws  Exception;
		public List<Line> findAll() throws Exception;
		public boolean deleteByt_Id(String t_Id) throws Exception;
		public Line findt_Id(String t_id) throws Exception;
}
