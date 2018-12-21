import java.util.Map;

public interface PollSubjectAndObsever {
	public void registerSubscribers(Subscribers sb);
	public void notifySubscribers();
	public Map<String, Integer> getTeams();
	public void getVote(Map<String, Integer> teams);
}
