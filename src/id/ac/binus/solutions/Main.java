package id.ac.binus.solutions;

public class Main {

	public static void main(String[] args) {
		Address address = new Address("90", 0);
		Author author = new Author("Kelompok 1", 20, address);
		Proposal proposal = new Proposal("Projek Code RE", 
				"Projek ini merupakan tugas dari mata kuliah Code Reengineering LE01", author);
		proposal.displayProposal(proposal);
		proposal.copyProposal(proposal);
	}

}
