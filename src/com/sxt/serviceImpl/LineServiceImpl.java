package com.sxt.serviceImpl;

import java.util.List;
import com.sxt.dao.impl.LineDaoImpl;
import com.sxt.service.LineService;
import com.sxt.vo.Line;


public class LineServiceImpl implements LineService{
    LineDaoImpl linedao = new LineDaoImpl();
    
	public boolean addLine(Line line) throws Exception {		
		return linedao.addLine(line);
	}
	public List<Line> findAll() throws Exception {
		return linedao.findAll();
	}
	public boolean deleteByt_Id(String t_Id) throws Exception {
		return linedao.deleteByt_Id(t_Id);
	}
	/*@Override
	public List<Line> findt_Id() throws Exception {
		return linedao.findt_Id();
	}*/
	@Override
	public Line findt_Id(String t_id) throws Exception {
		return linedao.findt_Id(t_id);
	}

}

