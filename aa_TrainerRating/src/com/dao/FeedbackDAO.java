package com.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.bean.Trainer;
import com.util.CollectionUtil;

public class FeedbackDAO implements IFeedbackDAO {
	// Map<Integer,Trainer> hm=new HashMap<>();
	Random random = new Random();
	HashMap<Integer, Trainer> hm = CollectionUtil.getHm();

	@Override
	public void addFeedback(Trainer trainer) {
		int randKey = random.nextInt(1000);
		hm.put(randKey, trainer);
		// System.out.println("DAO"+ hm);
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rate) {
		HashMap<Integer, Trainer> gethm = new HashMap<Integer, Trainer>();
		for (Entry<Integer, Trainer> entry : hm.entrySet()) {
			if (entry.getValue().getRating() == rate) {
				gethm.put(entry.getKey(), entry.getValue());
			}
		}
		return gethm;
	}

}
