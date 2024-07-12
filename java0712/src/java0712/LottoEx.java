package java0712;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoEx {
	public static void main(String[] args) {
		Random rd = new Random();
		Set<Integer> lottoSet = new HashSet<>(); // 중복 허용하지 않는 Set 사용
		
//		lottoSet.add(1);
//		lottoSet.add(1);
//		lottoSet.add(7);
		
		while(lottoSet.size()<6) {
			int num=rd.nextInt(45)+1;
			lottoSet.add(num);
		}
		
		System.out.println(lottoSet.size());
		System.out.println(lottoSet);
		
//		for(int i=0;i<lotto.length;i++) {
//			lotto[i]=rd.nextInt(6)+1;
//			System.out.println(lotto[i]);
//		}
	}

}
