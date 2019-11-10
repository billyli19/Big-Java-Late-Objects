/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_13;

import java.util.*;
/**
 *
 * @author billy
 */
public class RadixSorter {
    
    public static final int DEFAULT = 10;
    
    public static void sort(int[] a){
        sort(a, DEFAULT);
    }
    
    public static void sort(int[] a, int radix){
        int maxDigits = 1 + (int)(Math.log(max(a)) / Math.log(radix));
        int divisor = 1;
        
        for(int pos = 0; pos < maxDigits; pos++){
            List<List<Integer>> buckets = splitToBucket(a, divisor, radix);
            flattenBuckets(a, buckets);
            divisor *= radix;
        }
        List<List<Integer>> buckets = splitBySign(a);
        flattenBuckets(a, buckets);
    }
    
    private static List<List<Integer>> splitToBucket(int[] a, int divisor, int radix){
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i < radix; ++i){
            buckets.add(new LinkedList<>());
        }
        for(int num : a){
            int bucketIndex = Math.abs(num) / divisor % radix;
            buckets.get(bucketIndex).add(num);
        }
        return buckets;
    }
    
    private static List<List<Integer>> splitBySign(int[] a){
        List<Integer> pos = new LinkedList<>();
        List<Integer> neg = new LinkedList<>();
        for(int num : a){
            if(num >= 0){
                pos.add(num);
            } else {
                pos.add(0, num);
            }
        } 
        return Arrays.asList(neg, pos);
    }
    
    private static void flattenBuckets(int[] a, List<? extends List<Integer>> buckets){
        int i = 0;
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                a[i++] = num;
            }
        }
    }
    
    private static int max(int[] a){
        int max = 0;
        for(int num : a){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    
}
