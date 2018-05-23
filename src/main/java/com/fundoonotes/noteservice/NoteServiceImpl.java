package com.fundoonotes.noteservice;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoteServiceImpl implements INoteService {

	@Autowired
	NoteRepository noteRepository;
	
	@Override
	public int createNote(Note note) {
		
		noteRepository.save(note);
		return 0;
	}

	@Override
	public int updateNote(Note note) {
		noteRepository.save(note);
		return 0;
	}

	@Override
	public void deleteNote(int id) {
		
	noteRepository.deleteById(id);	
	
	}
	@Override
	public void getNotes(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
