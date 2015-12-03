package com.opennity.gof.str.Composite;

import java.util.List;

public class Comments extends SOFEntry{


	public Comments(String text) {
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
		throw new UnsupportedOperationException("cannot add to comments :"+ entry.toString());

	}

	@Override
	public boolean remove(SOFEntry entry) {
		throw new UnsupportedOperationException("cannot remove to comments :"+ entry.toString());


	}

	@Override
	public List<SOFEntry> getEntries() {
		throw new UnsupportedOperationException("no children to this comments :"+ value);
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
		return " comment is "+value;
	}



}
