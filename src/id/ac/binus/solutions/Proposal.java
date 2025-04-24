package id.ac.binus.solutions;

public class Proposal {

	private String proposalName;
	private String proposalDescription;
	private Author author;
	
	public Proposal(String proposalName, String proposalDescription, Author author) {
		this.proposalName = proposalName;
		this.proposalDescription = proposalDescription;
		this.author = author;
	}

	public String getProposalName() {
		return proposalName;
	}
	public String getProposalDescription() {
		return proposalDescription;
	}
	public Author getAuthor() {
		return author;
	}
	public String getName() {
        return this.author.getName();
    }
    public int getAge() {
        return this.author.getAge();
    }
    public Address getAddress() {
        return this.author.getAddress();
    }
    public String getStreet() {
        return this.author.getStreet();
    }
    public int getNumber() {
        return this.author.getNumber();
    }

	public Proposal copyProposal(Proposal proposal) {
		Proposal newProposal = new Proposal(proposal.getProposalName(), proposal.getProposalDescription(), proposal.getAuthor());
		
		return newProposal;
	}

	public void displayProposal(Proposal proposal) {
		System.out.printf("%s - %s by %s - [%d] lives in %s, %d", 
				proposal.getProposalName(), proposal.getProposalDescription(), 
				proposal.getName(), proposal.getAge(), 
				proposal.getStreet(), proposal.getNumber());
	}
}
