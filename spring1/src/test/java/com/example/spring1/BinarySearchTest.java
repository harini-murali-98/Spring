package com.example.spring1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring1.basic.BinarySearch;


@SpringBootTest
@ContextConfiguration(classes = springBasicMain.class)
public class BinarySearchTest {
	
	
	@Autowired
	BinarySearch binSearch;

	@Test
	void testBinSearch() {
		int result = binSearch.search(new int[] {12,1,23,233}, 2);
		Assert.assertEquals(3, result);
	}

}
