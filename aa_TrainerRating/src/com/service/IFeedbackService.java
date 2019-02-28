package com.service;

import java.util.HashMap;

import com.bean.Trainer;
import com.exception.NoTrainerFoundException;

public interface IFeedbackService 
{
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList(int rate) throws NoTrainerFoundException;
	public boolean checkRating(int rate);


}
