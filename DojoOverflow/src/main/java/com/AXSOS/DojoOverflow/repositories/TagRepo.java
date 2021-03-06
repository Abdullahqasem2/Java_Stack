package com.AXSOS.DojoOverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AXSOS.DojoOverflow.models.Tag;

@Repository
public interface TagRepo extends CrudRepository<Tag,Long> {
	Tag findBySubjectIgnoreCase(String subject);
}
