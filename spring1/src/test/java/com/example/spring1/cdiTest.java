package com.example.spring1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.spring1.cdi.CdiBusiness;
import com.example.spring1.cdi.CdiDao;



@SpringBootTest
@ContextConfiguration(classes = springCdiMain.class)

class cdiTest {
	
	
	@Mock
	CdiDao cdiDaomock;
	
	
	 

	@InjectMocks
	CdiBusiness cdiBusiness;
	
	
	@Test
	void test() {
		Mockito.when(cdiDaomock.getData()).thenReturn(new int[] {1,2,3});
		int greatest = cdiBusiness.findGreatest();
		Assert.assertEquals(3, greatest);
	}

	
	@Test
	void test1() {
		Mockito.when(cdiDaomock.getData()).thenReturn(new int[] {});
		int greatest = cdiBusiness.findGreatest();
		Assert.assertEquals(Integer.MIN_VALUE, greatest);
	}

}
