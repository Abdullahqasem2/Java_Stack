package com.AXSOS.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AXSOS.DojoOverflow.models.TagQuestion;

@Repository
public interface TagQuestionRepo extends CrudRepository<TagQuestion,Long> {

}
