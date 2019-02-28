package com.service;

import java.util.HashMap;

import com.bean.Trainer;
import com.dao.FeedbackDAO;
import com.dao.IFeedbackDAO;
import com.exception.NoTrainerFoundException;

public class FeedbackService implements IFeedbackService {
	IFeedbackDAO repo = new FeedbackDAO();


	public FeedbackService(IFeedbackDAO repo) {
		super();
		this.repo = repo;
	}


	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rate) throws NoTrainerFoundException {
		return repo.getTrainerList(rate);
	}

	@Override
	public void addFeedback(Trainer trainer) 
	{
		repo.addFeedback(trainer);

	}


	@Override
	public boolean checkRating(int rate) 
	{
		if(rate>=0 && rate<6 )
			return true;
		else
			return false;
	}
	

}
