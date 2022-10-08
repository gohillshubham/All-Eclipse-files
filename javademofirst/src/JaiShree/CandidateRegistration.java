package JaiShree;

import java.util.ArrayList;
import java.util.List;

public class CandidateRegistration {
	List<String> CandidateName;
	boolean FeesPaid;
	int NoOfStudents;
	List<String> Qualification;
	private static int Rcounter=0;
	public CandidateRegistration() {
		 this.CandidateName = new ArrayList<String>();
		 this.Qualification = new ArrayList<String>();
	}
	public CandidateRegistration(boolean feesPaid) {
		super();
		this.FeesPaid = feesPaid;
	}
	public List<String> getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(List<String> candidateName) {
		CandidateName = candidateName;
	}
	public boolean isFeesPaid() {
		return FeesPaid;
	}
	public void setFeesPaid(boolean feesPaid) {
		FeesPaid = feesPaid;
	}
	public int getNoOfStudents() {
		return NoOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		NoOfStudents = noOfStudents;
	}
	public List<String> getQualification() {
		return Qualification;
	}
	public void setQualification(List<String> qualification) {
		Qualification = qualification;
	}
	public int getRcounter() {
		return Rcounter;
	}
	public void setRcounter(int rcounter) {
		Rcounter = rcounter;
	}
	public int RegisterCandidate(Candidate candidateObject) {
		if(isFeesPaid()==true) {
			setRcounter(Rcounter+1);
		}
		setCandidateName(CandidateName);
		setQualification(Qualification);
		
		return 0;
		
	}
}
