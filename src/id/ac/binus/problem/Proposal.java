package id.ac.binus.problem;

/*
 * Smell Code : Missing Abstraction
 * Reason     : Developer menggunakan primitive data type dan juga terdapat data clumps
 * Treatment  : Extract Class
 */

public class Proposal {

	private String proposalName;
	private String proposalDescription;
	private String authorName;
	private int authorAge;
	private String authorAddressStreet;
	private int authorAddressNumber;
	
	public Proposal(String proposalName, String proposalDescription, String authorName, int authorAge,
			String authorAddressStreet, int authorAddressNumber) {
		this.proposalName = proposalName;
		this.proposalDescription = proposalDescription;
		this.authorName = authorName;
		this.authorAge = authorAge;
		this.authorAddressStreet = authorAddressStreet;
		this.authorAddressNumber = authorAddressNumber;
	}

	public String getProposalName() {
		return proposalName;
	}
	public String getProposalDescription() {
		return proposalDescription;
	}
	public String getAuthorName() {
		return authorName;
	}
	public int getAuthorAge() {
		return authorAge;
	}
	public String getAuthorAddressStreet() {
		return authorAddressStreet;
	}
	public int getAuthorAddressNumber() {
		return authorAddressNumber;
	}
	
}
