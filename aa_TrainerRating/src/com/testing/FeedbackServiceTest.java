package com.testing;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

import com.bean.Trainer;
import com.dao.FeedbackDAO;
import com.dao.IFeedbackDAO;
import com.exception.NoTrainerFoundException;
import com.service.FeedbackService;
import com.service.IFeedbackService;

public class FeedbackServiceTest 
{
	IFeedbackDAO repo=new FeedbackDAO();
	IFeedbackService service=new FeedbackService(repo);
	

	@Test
	public void WhenValidDetailsArePassedFeedbackAddedSuccessfully() throws NoTrainerFoundException 
	{
		Trainer trainer=new Trainer("asd", "dfsf", LocalDate.of(2012, 02, 20),LocalDate.of(2016, 02, 20),4);
		service.addFeedback(trainer);
		assertEquals(2,service.getTrainerList(4).size());
		
	}
	
	
	@Test
	public void WhenValidRatingIsPassedShowFeedbackAddedSuccessfully() throws NoTrainerFoundException 
	{
		Trainer trainer=new Trainer("asd", "dfsf", LocalDate.of(2012, 02, 20),LocalDate.of(2016, 02, 20),1);
		service.addFeedback(trainer);
		HashMap<Integer, Trainer> hmap = service.getTrainerList(1);
		for(Entry entry: hmap.entrySet()) {
			assertEquals(trainer, entry.getValue());
		}
		
	}
	
	@Test(expected=com.exception.NoTrainerFoundException.class)
	public void WhenInvalidRatingIsPassedShowThrowException() throws NoTrainerFoundException 
	{
	
		service.getTrainerList(3);
		
	}
	

	

}








//assertEquals(8,obj.addition(4, 4));