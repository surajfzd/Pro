package com.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.bean.Trainer;
import com.exception.NoTrainerFoundException;
import com.util.CollectionUtil;

public class FeedbackDAO implements IFeedbackDAO {
	
	Random random = new Random();										//Creating object of random class
	HashMap<Integer, Trainer> hm = CollectionUtil.getHm();				//Copying CollectionUtil default values to new HashMap

	@Override
	public void addFeedback(Trainer trainer) 							//
	{
		int randKey = random.nextInt(1000);
		hm.put(randKey, trainer);
		
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rate) throws NoTrainerFoundException 
	{
		HashMap<Integer, Trainer> gethm = new HashMap<Integer, Trainer>();
		for (Entry<Integer, Trainer> entry : hm.entrySet()) {
			if (entry.getValue().getRating() == rate) 
			{
				gethm.put(entry.getKey(), entry.getValue());
			}
		}
		if(gethm.isEmpty())
		{
			throw new NoTrainerFoundException();
		}
		else 
		{
			return gethm;			
		}
		
	}

}
