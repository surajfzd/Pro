package com.service;

import java.util.HashMap;

import com.bean.Trainer;
import com.dao.FeedbackDAO;
import com.dao.IFeedbackDAO;

public class FeedbackService implements IFeedbackService {
	IFeedbackDAO repo = new FeedbackDAO();

	public FeedbackService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rate) {
		return repo.getTrainerList(rate);
	}

	@Override
	public void addFeedback(Trainer trainer) {
		repo.addFeedback(trainer);

	}

}
