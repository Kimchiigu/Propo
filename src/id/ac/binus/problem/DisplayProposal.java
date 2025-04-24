package id.ac.binus.problem;

public class DisplayProposal {

	public void displayProposal(Proposal proposal) {
		System.out.printf("%s - %s by %s - [%d] lives in %s, %d", 
				proposal.getProposalName(), proposal.getProposalDescription(), 
				proposal.getAuthorName(), proposal.getAuthorAge(), 
				proposal.getAuthorAddressStreet(), proposal.getAuthorAddressNumber());
	}
}
