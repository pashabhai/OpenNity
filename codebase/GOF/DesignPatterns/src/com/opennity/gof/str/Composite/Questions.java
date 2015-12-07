package com.opennity.gof.str.Composite;

import java.util.ArrayList;
import java.util.List;

public class Questions extends SOFEntry {


	private final List<SOFEntry> entries = new ArrayList<>();

	public Questions(String text) {
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
	public boolean add(SOFEntry entry) {
		return entries.add(entry);


	}

	@Override
	public boolean remove(SOFEntry entry) {
		return entries.remove(entry);

	}

	@Override
	public List<SOFEntry> getEntries() {

		return new ArrayList<SOFEntry>(entries);
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
		StringBuilder publishString = new StringBuilder();
		publishString.append(" question is " +value + "\n");

		for(SOFEntry entry : entries){
				publishString.append("\t" + entry.publish()+ "\n");
				//System.out.println(publishString);

		}

		return publishString.toString();
	}


}
