package id.ac.binus.solutions;

public class Proposal {

	private String proposalName;
	private String proposalDescription;
	
	public Proposal(String proposalName, String proposalDescription) {
		this.proposalName = proposalName;
		this.proposalDescription = proposalDescription;
	}

	public String getProposalName() {
		return proposalName;
	}
	public String getProposalDescription() {
		return proposalDescription;
	}

	public Proposal copyProposal(Proposal proposal) {
		Proposal newProposal = new Proposal(proposal.getProposalName(), proposal.getProposalDescription(), 
				proposal.getAuthorName(), proposal.getAuthorAge(), 
				proposal.getAuthorAddressStreet(), proposal.getAuthorAddressNumber());
		
		return newProposal;
	}

	public void displayProposal(Proposal proposal) {
		System.out.printf("%s - %s by %s - [%d] lives in %s, %d", 
				proposal.getProposalName(), proposal.getProposalDescription(), 
				proposal.getAuthorName(), proposal.getAuthorAge(), 
				proposal.getAuthorAddressStreet(), proposal.getAuthorAddressNumber());
	}
}
