package com.julianne.leetcode;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }

    public static void main(String[] args) {
        TopKFrequentElements elements = new TopKFrequentElements();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] topK = elements.topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(topK));
    }
}
