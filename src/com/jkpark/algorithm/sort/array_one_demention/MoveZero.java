package com.jkpark.algorithm.sort.array_one_demention;

import com.jkpark.algorithm.BaseAlgorithm;
import com.jkpark.algorithm.BaseMain;

import java.util.Arrays;

/**
 * 문제
	 * 정수 배열이 주어졌을 0을 모두 오른쪽으로 옮겨라
 * 조건
	 * 시간복잡도 O(n)
	 * 공간복잡도 O(1)
	 * 정렬된 배열 반환
 */

public class MoveZero extends BaseMain {
	public static void main(String[] args) {
		execute(new Algorithm());
	}

	static class Algorithm extends BaseAlgorithm {
		private int[] nums;

		@Override
		public void initParam() {
			this.nums = new int[] {0, 5, 0, 7, 6, 3};
		}

		@Override
		public void execute() {
			this.execute(nums);
		}

		@Override
		public void printResult() {
			System.out.println(Arrays.toString(nums));
		}

		private void execute(int[] nums) {
			// 0 의 위치를 표시해주는 index
			int zeroIdx = 0;

			for(int searchIdx = 0; searchIdx < nums.length; searchIdx++) {
				if(nums[searchIdx] != 0) {
					nums[zeroIdx] = nums[searchIdx];
					zeroIdx++;
				}
			}

			for(; zeroIdx < nums.length; zeroIdx++) {
				nums[zeroIdx] = 0;
			}
		}
	}
}

