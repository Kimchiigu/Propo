package id.ac.binus.problem;

/*
 * Smell Code : Imperative Abstraction
 * Reason     : Developer membuat class yang hanya berisi 1 method dan merupakan kata kerja
 * Solution   : Inline Class
 */

public class DisplayProposal {

	public void displayProposal(Proposal proposal) {
		System.out.printf("%s - %s by %s - [%d] lives in %s, %d", 
				proposal.getProposalName(), proposal.getProposalDescription(), 
				proposal.getAuthorName(), proposal.getAuthorAge(), 
				proposal.getAuthorAddressStreet(), proposal.getAuthorAddressNumber());
	}
}
