package com.jkpark.algorithm.search.array_one_demention;

import com.jkpark.algorithm.BaseAlgorithm;
import com.jkpark.algorithm.BaseMain;

/**
 * 문제
	 * 정렬된 array nums 가 주어졌을 때, 원하는 target 을 찾는 코드를 작성하라
 * 조건
	 * 시간복잡도 O(log n)
	 * 공간복잡도 O(1)
	 * 찾는 값이 없다면 -1 반환
 */

public class BinarySearch extends BaseMain {
	public static void main(String[] args) {
		execute(new Algorithm());
	}

	static class Algorithm extends BaseAlgorithm {
		private int[] nums;
		private int target;

		private int result;

		@Override
		public void initParam() {
			this.nums = new int[] {1, 3, 5, 6, 7, 15, 20, 25, 40, 57, 80};
			this.target = 3;
		}

		@Override
		public void execute() {
			this. result = this.execute(nums, target);
		}

		@Override
		public void printResult() {
			System.out.println(this.result);
		}

		private int execute(int[] nums, int target) {
			int left = 0;
			int right = nums.length - 1;

			while (left <= right) {
				int pivot = (left + right) / 2;

				if(nums[pivot] == target) {
					return pivot;
				}

				else if(nums[pivot] < target) {
					left = pivot + 1;
				}
				else {
					right = pivot - 1;
				}
			}

			return -1;
		}
	}
}
