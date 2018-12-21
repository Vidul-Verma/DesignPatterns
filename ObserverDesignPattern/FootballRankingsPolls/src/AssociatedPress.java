import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class AssociatedPress implements PollSubjectAndObsever{

	public Map<String, Integer> teams;
	public ArrayList<Map> table;
	ArrayList<Subscribers> subscribers;
	AssociatedPress(){
		table = new ArrayList<Map>();
		subscribers = new ArrayList<Subscribers>();
		
	}
	
	public void subscribeToVoter(VoterClass voter) {
		voter.registerPoll(this);
	}
	
	@Override
	public void registerSubscribers(Subscribers sb) {
		// TODO Auto-generated method stub
		subscribers.add(sb);
	}
	
	
	
	public void setTeams(String[] arr) {
		teams = new HashMap<String, Integer>();
		int counter = 1;
		for(int i = 0 ; i < arr.length ; i ++) {
			teams.put(arr[i], 0);
			counter ++;
		}
		
	}
	public Map<String, Integer> getTeams() {
		Map<String, Integer> voteTeams = new HashMap<String, Integer>();
		for (String key : teams.keySet()) {
	        voteTeams.put(key, 0);
	    }
		return voteTeams;
	}
	

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		String[] arr = new String[teams.size()];
		int counter = 0;
		for (String key : teams.keySet()) {
	        arr[counter] = key;
	        counter++;
	    }
		Iterator<Subscribers> iterator = this.subscribers.iterator();
		
		while(iterator.hasNext()) {
			iterator.next().updateDisplay(arr, "ap");
		}
	}

	
	public void calculatePoll() {
		for (Map<String, Integer> entry : this.table) {
		    for (String key : entry.keySet()) {
		        Integer value = entry.get(key);
		        teams.put(key, teams.get(key) + 26 - entry.get(key));
		    }
		}
		
		teams = sortByValue(teams);
		System.out.println("______TOTAL WEEKLY POINTS AP___________");
		for (String key : teams.keySet()) {
	        Integer value = teams.get(key);
	        System.out.println(key + " " + value);
	    }
		notifySubscribers();
	}
	
	public void getVote(Map<String, Integer> vote){
		this.table.add(vote);
	}

	public static <String, Integer extends Comparable<? super Integer>> Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
	
}

