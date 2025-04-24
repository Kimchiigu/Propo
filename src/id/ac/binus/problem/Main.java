package id.ac.binus.problem;

public class Main {

	public static void main(String[] args) {
		Proposal proposal = new Proposal("Projek Code RE", 
				"Projek ini merupakan tugas dari mata kuliah Code Reengineering LE01",
				"Kelompok 1", 20, "BINUS Alam Sutera", 90);
		DisplayProposal displayProposal = new DisplayProposal();
		displayProposal.displayProposal(proposal);
		CopyProposal copyProposal = new CopyProposal();
		Proposal newProposal = copyProposal.copyProposal(proposal);
		displayProposal.displayProposal(newProposal);
	}

}
