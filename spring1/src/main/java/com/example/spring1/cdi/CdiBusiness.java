package com.example.spring1.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CdiBusiness {
	
	@Inject
	CdiDao cdiDao;

	public CdiDao getCdiDao() {
		return cdiDao;
	}

	public void setCdiDao(CdiDao cdiDao) {
		this.cdiDao = cdiDao;
	}

	
	public int findGreatest()
	{
		int data[] = cdiDao.getData();
		int greatest = Integer.MIN_VALUE;
		
		for(int i : data)
		{
			if(i>greatest)
			{
				greatest=i;
			}
		}
		
		return greatest;
	}
	
}
