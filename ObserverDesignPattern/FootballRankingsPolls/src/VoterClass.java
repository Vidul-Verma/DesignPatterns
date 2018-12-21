import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class VoterClass implements VoterSubject{

	ArrayList<PollSubjectAndObsever> polls;
	private Map<String, Integer> teams;
	VoterClass(){
		polls = new ArrayList<PollSubjectAndObsever>();
	}
	
	@Override
	public void registerPoll(PollSubjectAndObsever sb) {
		// TODO Auto-generated method stub
		polls.add(sb);
	}
	@Override
	public void votePolls() {
		// TODO Auto-generated method stub
		Iterator<PollSubjectAndObsever> iterator = this.polls.iterator();
		
		while(iterator.hasNext()) {
			PollSubjectAndObsever poll = iterator.next();
			teams = poll.getTeams();
			Random r = new Random();
			int currentRank = r.nextInt(26) + 1;
			for (String key : teams.keySet()) {
			    teams.put(key, currentRank);
			    while(teams.containsValue(currentRank)) {
			    	currentRank = r.nextInt(26) + 1 ;
			    }
			}
			poll.getVote(teams);
			
		}
	}
	
	
}
 