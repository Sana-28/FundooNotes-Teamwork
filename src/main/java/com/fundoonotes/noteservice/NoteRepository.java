package com.fundoonotes.noteservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository(value="noteDao")
public interface NoteRepository extends JpaRepository<Note, Integer> {

	
}
