package id.ac.binus.problem;

/*
 * Smell Code : Imperative Abstraction
 * Reason     : Developer membuat class yang hanya berisi 1 method dan merupakan kata kerja
 * Solution   : Inline Class
 */

public class CopyProposal {

	public Proposal copyProposal(Proposal proposal) {
		Proposal newProposal = new Proposal(proposal.getProposalName(), proposal.getProposalDescription(), 
				proposal.getAuthorName(), proposal.getAuthorAge(), 
				proposal.getAuthorAddressStreet(), proposal.getAuthorAddressNumber());
		
		return newProposal;
	}
}
