import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
public class MainClass {
	static String[] teams;
	public static void main(String[] args) throws FileNotFoundException {
		teams = new String[25];
		AssociatedPress ap = new AssociatedPress();
		USAToday ut = new USAToday();
		LATimes lat = new LATimes(ap);
		WashingtonPost wp = new WashingtonPost(ap);
		SportsWeekly sw = new SportsWeekly(ap);
		EspnToday et = new EspnToday(ap);
		LATimes lat1 = new LATimes(ut);
		WashingtonPost wp1 = new WashingtonPost(ut);
		SportsWeekly sw1 = new SportsWeekly(ut);
		EspnToday et1 = new EspnToday(ut);
		Scanner sc = new Scanner(new File("./teams.txt"));
		int counter = 0;
		while (sc.hasNext()) {
			teams[counter] = sc.next();
		    counter++;
		}
		ap.setTeams(teams);
		ut.setTeams(teams);
		
		for(int i = 1 ; i <= 100 ; i ++) {
			VoterClass v = new VoterClass();
			if(i <= 40) {
				ap.subscribeToVoter(v);

			}
			if(i > 40 && i <= 60) {
				ap.subscribeToVoter(v);
				ut.subscribeToVoter(v);

			}
			if(i > 60) {
				ut.subscribeToVoter(v);

			}
			v.votePolls();

		}

		ap.calculatePoll();
		ut.calculatePoll();
		

	}
	
}
