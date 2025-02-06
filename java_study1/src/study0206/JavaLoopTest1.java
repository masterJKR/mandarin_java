package study0206;

import java.util.Scanner;

public class JavaLoopTest1 {

	public static void main(String[] args) {
		/* 
		 문제 1 - 무한루프 
			정수 한개씩  계속 입력 받기  
			입력 하다가 0 을 입력하면  
			지금 까지 입력한 모든 숫자의 합 출력
			int sum=0;
			while(true){
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				if( num==0 ) break;
				sum += num;
			}
			System.out.println(" 총합 : " + sum );
		
		 문제 2 - 무한루프
		 	컴퓨터 와 가위 바위 보 게임 하기
		 	내가 10번을 이길때 까지 계속 게임하기 
		 	10번 이기면  그동안 몇번 패배 하고 몇번 비겼는지 출력
		 	int win=0, lose=0, draw=0;
		 	while(true){
		 		System.out.print("1.가위  2.바위  3.보  : ");
				int me = sc.nextInt(); // 키보드를 통해 입력
				int com = (int)(Math.random() * 3 + 1);
				if(me == com ) { // 서로 같은 값이면 비김
					System.out.println("비김");draw++;
				}else if( (me==1 && com==3) || (me==2 && com==1) 
						|| (me==3 && com==2)) {
					System.out.println("이김"); win++;
				}else {
					System.out.println("패배..."); lose++;
				}
				if(win==10) break;
		 	}
		 	System.out.println("패배 : "+lose + "  비김 : "+ draw);
		
		 문제 3
		    컴퓨터 와 주사위 게임을 한다.
		    각각  주사위 2개를 던져서  주사위 합이 큰쪽이 이긴다.
		    단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
		    둘가 같은 숫자가 나왔다면 합이 큰쪽이 이긴다.
		    예) 나 - 3,4   컴 - 1,3   내가 이김
		       나 - 5,6   컴 - 1,1   컴퓨터 이김
		    5판을 진행 했을때 몇승 몇패 몇무 인지 출력
		    
		    
		    
		    
		    
		    오늘 의 과제  
		     베스킨라빈스 31 게임 만들기
		     나와 컴퓨터 둘이서 진행 
		     31을 제시하는 쪽이 패배 
		     나 부터 시작 한다. 
		     숫자 몇개를 제시할것인지 갯수를 입력하면 자동으로 숫자가 나온다.
		     컴퓨터는 랜덤을 이용해서 몇개 제시할것인지 해야한다.
		     숫자는 1개 부터 3개까지 가능
예시)
나 - 몇개 ? 2
나 : 1  2  
컴 : 3  
나 - 몇개 ? 1
나 : 4  
컴 : 5  6  7  
나 - 몇개 ? 3
나 : 8  9  10  
컴 : 11  12  
나 - 몇개 ? 3
		*/

	}

}




