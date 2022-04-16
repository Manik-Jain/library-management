package com.preeti.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.preeti.models.IssueBooks;

@Repository

public interface IssueRepository extends CrudRepository <IssueBooks,Long>{

}
