package JaiShree;

public class TopPerformer extends Candidate {
	private int Rank;
	public TopPerformer(String candidateName, int age, String qualification,int rank) {
		super(candidateName, age, qualification);
		this.Rank=rank;
		// TODO Auto-generated constructor stub
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}



	@Override
	public int EnlistCandidate() {
		// TODO Auto-generated method stub
		if(getQualification().equals("BE"))
		{
			if(getRank()>0 && getRank() <=5) 
				setPriorityIndex(9);
			else
				setPriorityIndex(8);
			return 1;
		}
		if(getQualification().equals("ME"))
		{
			if(getRank()>0 && getRank() <=5) 
				setPriorityIndex(7);
			else
				setPriorityIndex(6);
			return 1;
		}
		return -1;
	}
	
}
