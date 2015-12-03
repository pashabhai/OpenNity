package com.opennity.gof.str.Composite;

import java.util.List;

/**
 *
 * @author Prashant.Purkar
 * This class represents the entry/blog on a stackoverflow.com web site.
 * entry can be of type question, answer and a comment
 *
 *  voteUp, VoteDown are methods that clients of the components can call.
 */

public abstract class SOFEntry {

	protected int upVotes = 0;
	protected int dwonVotes = 0;
	protected String value;

	public SOFEntry(String text){
		this.value = text;
	}

	public abstract void voteUp();
	public abstract void voteDown();
	public abstract String edit();
	public abstract String publish();
	public abstract boolean add(SOFEntry entry);
	public abstract boolean remove(SOFEntry entry);
	public abstract List<SOFEntry> getEntries();

	@Override
	public String toString() {
		return value;
	}


}
