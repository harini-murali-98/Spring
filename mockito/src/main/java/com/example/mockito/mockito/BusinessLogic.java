package com.example.mockito.mockito;

public class BusinessLogic {
	
	int array[] = {1,2,3};
	
	private DataService dataService;

	public BusinessLogic(DataService dataService) {
		super();
		this.dataService = dataService;
		
		System.out.print("apple".compareTo("banana"));
		
		for(int i=0;i<10;i=i++)
		{
			i+=1;
			System.out.print(i);
		}

	}
	
	
	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
