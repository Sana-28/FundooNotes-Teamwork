package com.fundoonotes.noteservice;


public interface INoteService {

	int createNote(Note note);
	int updateNote(Note note);
	void deleteNote(int id);
	void getNotes(int id);	
	
}
