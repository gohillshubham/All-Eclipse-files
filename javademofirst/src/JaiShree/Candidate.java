package JaiShree;

public abstract class Candidate {
	public static int counter =  999;
	private int Age;
	private int CandidateId;
	private String CandidateName;
	private int PriorityIndex;
	private String Qualification;
	public Candidate(){
		Candidate.counter= counter+1;
		this.CandidateId=Candidate.counter;
	}
	public Candidate(String candidateName, int age,String qualification){
		CandidateName=candidateName;
		Age=age;
		Qualification=qualification;
	}
	public abstract int EnlistCandidate() ;
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getCandidateId() {
		return CandidateId;
	}
	public void setCandidateId(int candidateId) {
		CandidateId = candidateId;
	}
	public String getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	public int getPriorityIndex() {
		return PriorityIndex;
	}
	public void setPriorityIndex(int priorityIndex) {
		PriorityIndex = priorityIndex;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
}
