package com.service;

import java.util.HashMap;

import com.bean.Trainer;

public interface IFeedbackService 
{
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList(int rate);

}
