package com.opennity.gof.str.Composite;

import java.util.List;

/**
 *
 * @author Prashant.Purkar
 * This class represents the entry on a stackoverflow.com web site.
 * entry can be of type question, answer and a comment
 *
 *  voteUp, VoteDown are methods that clients of the components can call.
 */

public abstract class SOFEntry {

	public abstract void voteUp();
	public abstract void voteDown();
	public abstract void add(SOFEntry entry);
	public abstract void remove(SOFEntry enty);
	public abstract List<SOFEntry> getEntries();


}
