package com.jkpark.algorithm.search.array_one_demention;

import com.jkpark.algorithm.BaseAlgorithm;
import com.jkpark.algorithm.BaseMain;

/**
 * 문제
	 * 주어진 int array 를 이등분 했을 때,
	 * 좌 우 합계 값이 같아지는 pivot 찾기
 * 조건
	 * 시간복잡도 O(n)
	 * 공간복잡도 O(1)
	 * 찾는 값이 없다면 -1 반환
 */

public class FindPivotIndex extends BaseMain {
	public static void main(String[] args) {
		execute(new Algorithm());
	}

	static class Algorithm extends BaseAlgorithm {
		private int[] nums;

		private int result;

		@Override
		public void initParam() {
			this.nums = new int[] {1, 8, 2, 9, 2, 3, 6};
		}

		@Override
		public void execute() {
			this. result = this.execute(nums);
		}

		@Override
		public void printResult() {
			System.out.println(this.result);
		}

		private int execute(int[] nums) {
			int sum = this.getSum(nums);
			int leftSum = 0;
			int rightSum = sum;

			int pastPivotNum = 0;

			for(int i = 0; i < nums.length; i++) {
				int num = nums[i];
				rightSum -= num;
				leftSum += pastPivotNum;

				if(leftSum == rightSum) {
					return i;
				}
				pastPivotNum = num;
			}

			return -1;
		}

		private int getSum(int[] nums) {
			int sum = 0;

			for(int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}

			return sum;
		}
	}
}
