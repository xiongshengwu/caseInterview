package threadSum;

import java.util.Date;

public class ThreadSum implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		long beginTime = new Date().getTime();
		for (int i = 0; i < 1000000; i++) {
			sum+=i;
		}

		long endTime = new Date().getTime();
		System.out.println("耗时:"+(endTime - beginTime)+"求和:" +sum);
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

	private int getSum(int startNum,int endNum){
		int sum = 0;
		for (int i = startNum; i < endNum - startNum; i++) {
			sum += i;
		}
		return sum;
	}
	
}
