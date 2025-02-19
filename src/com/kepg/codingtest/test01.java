package com.kepg.codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class test01 {

	public static void main(String[] args) {
//		시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//		1 초	128 MB	138854	81423	71644	59.485%
		
//		문제
//		동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//
//		체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//
//		체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//
//		동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
		
		List<Integer> blackpieceList = new ArrayList<>();
		blackpieceList.add(0);// put과 add가 아직 헷갈림
		blackpieceList.add(1);
		blackpieceList.add(2);
		blackpieceList.add(2);
		blackpieceList.add(2);
		blackpieceList.add(7);
		
//			List<Integer> whitepieceList = new ArrayList<>();
//			whitepieceList.add(1);
//			whitepieceList.add(1);
//			whitepieceList.add(2);
//			whitepieceList.add(2);
//			whitepieceList.add(2);
//			whitepieceList.add(8);
		
		List <Integer> whitepieceList = List.of(1,1,2,2,2,8); // List.of는 수정 불가
	
//		for(int i = 0; i < blackpieceList.size(); i++) {
//			int count = whitepieceList.get(i) - blackpieceList.get(i);
//			System.out.print(count + " ");
//		}
		
		IntStream.range(0, whitepieceList.size())
				.map(i -> whitepieceList.get(i)-blackpieceList.get(i))
				.forEach(result -> System.out.print(result + " "));
		
		// IntStream(start,end) -> for 루프와 비슷
//		IntStream.range(0, 10).forEach(i -> System.out.print(i));
		int[] numbers = {3, 5, 7, 9};
        Arrays.stream(numbers).forEach(System.out::println); 
        
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // forEach()를 사용하여 요소 출력
        names.forEach(System.out::println);
        
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6);

        //짝수만 출력
       numbers1.stream()
       			.filter(i -> i % 2 == 0)
       			.forEach(System.out::println);
	}
	
}
