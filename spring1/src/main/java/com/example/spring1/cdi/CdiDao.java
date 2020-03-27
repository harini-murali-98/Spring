package com.example.spring1.cdi;


import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class CdiDao {
	
	public int[] getData()
	{
		return new int[] {1,23,34};
	}

}
