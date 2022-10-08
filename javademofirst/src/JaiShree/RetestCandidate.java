package JaiShree;

public class RetestCandidate extends Candidate{
	private int NoOfRetest;
	
	public RetestCandidate() {
		super();
	}

	public RetestCandidate(String candidateName, int age,String qualification,int noOfRetest) {
		super(candidateName,age,qualification);
		NoOfRetest = noOfRetest;
	}

	@Override
	public int EnlistCandidate()  {
		
		if(this.NoOfRetest==1) {
				if(getQualification()=="BE")
					setPriorityIndex(4);
				if(getQualification()=="ME")
					setPriorityIndex(3);
				else
					setPriorityIndex(2);
				return 1;
			}
			if(this.NoOfRetest==0) {
				if(getQualification()=="BE")
					setPriorityIndex(5);
				if(getQualification()=="ME")
					setPriorityIndex(4);
				else
					setPriorityIndex(2);
				return 1;
			}
			return -1;
	
	}
}


