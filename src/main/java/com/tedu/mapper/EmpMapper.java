package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.EmpBean;

//dao mapper�Ľӿ���
public interface EmpMapper {
	//��ѯ��������
	public List<EmpBean> selectAllEmp();
	//��ѯ�������ݣ�����һ��Ψһid
	public EmpBean selectEmpById(int id);
	
}