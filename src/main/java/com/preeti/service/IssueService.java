package com.preeti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preeti.models.IssueBooks;
import com.preeti.repository.IssueRepository;
import java.sql.Date;
import java.util.Calendar;

@Service
public class IssueService {
	

	private IssueRepository issueRepo;
	
	public String newIssue(IssueBooks i)
	{
		i.setIssued(1);
		long millis=System.currentTimeMillis();
		Date d = new Date(millis);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, 7);
		Date returnBook = (Date) cal.getTime();
		i.setIssueDate(d);
		i.setReturnDate(returnBook);
		IssueBooks newIssue=issueRepo.save(i);
		return "issued";
	}
	
	public String returnBook(IssueBooks i)
	{
		i.setIssued(0);
		long millis=System.currentTimeMillis();
		Date d = new Date(millis);
		i.setActualReturnDate(d);
		IssueBooks newIssue=issueRepo.save(i);
		return "returned";
	}

}
