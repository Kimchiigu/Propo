package id.ac.binus.problem;

public class CopyProposal {

	public Proposal copyProposal(Proposal proposal) {
		Proposal newProposal = new Proposal(proposal.getProposalName(), proposal.getProposalDescription(), 
				proposal.getAuthorName(), proposal.getAuthorAge(), 
				proposal.getAuthorAddressStreet(), proposal.getAuthorAddressNumber());
		
		return newProposal;
	}
}
