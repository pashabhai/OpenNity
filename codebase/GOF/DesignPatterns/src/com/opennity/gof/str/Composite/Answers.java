package com.opennity.gof.str.Composite;

import java.util.ArrayList;
import java.util.List;

public class Answers extends SOFEntry {

	private final List<SOFEntry> commentsOnly = new ArrayList<>();

	public Answers(String text){
		super(text);
	}


	@Override
	public void voteUp() {
		upVotes++;

	}

	@Override
	public void voteDown() {
		dwonVotes++;

	}

	@Override
	public String edit() {
		if(value!=null){
			return value;
		}
		return null;
	}

	@Override
	public String publish() {
		String publishString = "answer is "+value + "\n";
		for(SOFEntry comment : commentsOnly){

				publishString += "\t" + comment.publish()+ "\n";

		}
		System.out.println("ans "+publishString);
		return publishString;
	}

	@Override
	public boolean add(SOFEntry entry) {
			if(entry instanceof Comments){
				return commentsOnly.add(entry);
			} else throw new UnsupportedOperationException("cannot add to comments :"+ entry.toString());


	}

	@Override
	public boolean remove(SOFEntry entry) {
		return commentsOnly.remove(entry);

	}

	@Override
	public List<SOFEntry> getEntries() {
		return new ArrayList<SOFEntry>(commentsOnly);
	}

}
