import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int score[11]; // in C++
		
		int score[] = new int [11];
		
		score[0] = 90;
		score[1] = 89;
		score[2] = 0;
		score[3] = 10;
		score[4] = 89;
		
		for(int i =0; i<score.length;i++)
		{
			System.out.println("score:- "+score[i]);
		}
		
		//int score[] = {10,88,90,0,56};
		
		System.out.println();
		
		
		ArrayList scoreList = new ArrayList();
		
		scoreList.add(10);
		scoreList.add(88);
		scoreList.add(90);
		scoreList.add(0);
		scoreList.add(56);
		
		for(int i = 0; i<scoreList.size();i++)
		{
			System.out.println("Score = "+scoreList.get(i));
		}

	}

}
