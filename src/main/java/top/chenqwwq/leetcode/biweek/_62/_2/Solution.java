package top.chenqwwq.leetcode.biweek._62._2;

import javafx.beans.value.ObservableNumberValue;

/**
 * @author: chenqwwq
 * @date: 2021/10/4 9:19 下午
 **/
public class Solution {
	public int numOfPairs(String[] nums, String target) {
		final int n = nums.length;
		int ans = 0;
		for (int i = 0; i < n;i++){
			for (int j = 0;j < n;j++){
				if(i == j){
					continue;
				}
				if((nums[i] + nums[j]).equals(target)){
					ans++;
				}
			}
		}
		return ans;
	}
}