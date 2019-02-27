package com.dao;

import java.util.HashMap;

import com.bean.Trainer;

public interface IFeedbackDAO 
{
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList(int rate);

}
