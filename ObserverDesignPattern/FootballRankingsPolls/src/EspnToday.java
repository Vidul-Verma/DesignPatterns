import java.util.ArrayList;

public class EspnToday implements Subscribers{

	private ArrayList<PollSubjectAndObsever> polls;
	private String[] pollRanks;
	
	EspnToday(PollSubjectAndObsever sub){
		sub.registerSubscribers(this);
	}
	
	
	@Override
	public void updateDisplay(String[] ranks, String pollName) {
		// TODO Auto-generated method stub
		this.pollRanks = ranks;
		if(pollName.equals("ap")) {
			DisplayScreenAP();
		}else {
			DisplayScreenUT();
		}
	}
	
	public void DisplayScreenAP() {
		System.out.println(" ");
		System.out.println("\t\t ESPN Today");
		System.out.println(" _________________________________");
		System.out.println("Associated Press Ranks");
		for(int i = 0 ; i < pollRanks.length ; i++) {
			System.out.println((i+1) + ". "+ pollRanks[i]);
		}
		
	}
	public void DisplayScreenUT() {
		System.out.println(" ");
		System.out.println("\t\t ESPN Today");
		System.out.println(" _________________________________");
		System.out.println("USA Today Ranks");
		for(int i = 0 ; i < pollRanks.length ; i++) {
			System.out.println((i+1) + ". "+ pollRanks[i]);
		}
		
	}
}
