import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nTable = sc.nextInt();
		int[] tables = new int[nTable];
		
		for(int i = 0; i < nTable; i++)
		{
			tables[i] = sc.nextInt();
		}
		
		int nHand = sc.nextInt();
		int[] hands = new int[nHand];
		
		for(int i = 0; i < nHand; i++)
		{
			hands[i] = sc.nextInt();
		}
		
		int nCards = 0;
		for(int i = 0; i < nHand; i++)
		{
			for(int j = 0; j < nTable; j++)
			{
				if(hands[i] == tables[j]-1 || hands[i] == tables[j]+1)
					nCards++;
			}
		}
		
		System.out.println(nCards);
		
		sc.close();
	}

}
