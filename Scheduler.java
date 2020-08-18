import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scheduler 
{
	private int numInterval;
	private Interval[] intervals;
	private BufferedReader console;
	private int sTime;
	private int eTime;
	
	public Scheduler()
	{
		console = new BufferedReader( new InputStreamReader(System.in));
	}
	
	public void Schedule()
	{

	}
	
	public void Partition()
	{
		
	}
	
	public void start() throws IOException
	{
		System.out.println("Please enter the number of intervals: ");
		numInterval = Integer.parseInt(console.readLine());
		
		System.out.println("Please enter the start time of intervals: ");
		sTime = Integer.parseInt(console.readLine());
		
		System.out.println("Please enter end time of intervals: ");
		eTime = Integer.parseInt(console.readLine());
		
		intervals = new Interval[numInterval];
		
		//(int)(Math.random() * (max - min) + min)
		//Creates Initial Intervals
		int s = 0; // temp for start time
		int e = 0; // temp for end time
		for(int i = 0; i < numInterval; i++)
		{
			s = (int)(Math.random() * (eTime - sTime) + sTime);
			e = (int)(Math.random() * (eTime - (s + 1)) + (s + 1));
			

			intervals[i] = new Interval(i, s, e);
		}
		
		for(int i = 0; i < numInterval; i++)
		{
			System.out.println(intervals[i]);
		}
	}
}
