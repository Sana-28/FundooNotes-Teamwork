package com.fundoonotes.noteservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NoteController {

	@Autowired
	INoteService noteService;
	
	@RequestMapping(value="createnote", method = RequestMethod.POST)
	ResponseEntity<Note> createNote(@RequestBody Note note){
		
		noteService.createNote(note);
		return new ResponseEntity<Note>(note ,HttpStatus.OK);	
		}
	
	@RequestMapping(value="updatenote", method = RequestMethod.POST)
	ResponseEntity<Note> updateNote(@RequestBody Note note){
		
		noteService.updateNote(note);
		return new ResponseEntity<Note>(note, HttpStatus.OK);
	}
	
	@RequestMapping(value="deletenote/{id}", method = RequestMethod.DELETE)
	ResponseEntity<String> deleteNote(@PathVariable int id){
		noteService.deleteNote(id);
		return new ResponseEntity<String>("Note deleted succesfully", HttpStatus.OK);
	}
	

	@RequestMapping(value="/getNotes{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getNotes(@PathVariable int id){
		
		
		try {
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return null;
	}
}
