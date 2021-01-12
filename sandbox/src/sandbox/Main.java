package sandbox;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] arr = {5, 15, 20 , 75 , 30, 45, 60, 20, 5, 90, 20};
		
		String[] words = {"Congratulations", "Java", "Microsoft", "Programing", "Google"};
		System.out.println(mode(arr));
		System.out.println(limit(20));
		ArrayList<Integer> l = getEvenNumbers(arr);
		System.out.println(l);
		System.out.println(getLongestWord(words));
		System.out.println(getShortestWord(words));
		
		ArrayList<Integer> distinct = removeDuplicates(arr);
		System.out.println(distinct);
	}
	
	public static int mode(int[] arr) {
		int count = 0;
		int popularNumber = 0;
		for (int i : arr) {
			int count1 = 0;
			for (int j : arr) {
				if (i == j) {
					count1++;
				}
			}
			if(count1 > count) {
				popularNumber = i;
				count = count1;
			}
		}
		return popularNumber;
	}
	
	public static int limit(int x) {
		if (x == 0 || x>= 20) {
			return x=1;
		}
		return ++x;
	}
	
	public static ArrayList<Integer> getEvenNumbers(int[] arr){
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i : arr) {
			if (i%2 == 0) {
				l.add(i);
			}
		}
		return l;
	}

	public static String getLongestWord (String[] words) {
		String longestWord = words[0];
		for (int i= 0;i<words.length;i++) {
			if (words[i].length()>longestWord.length()) {
				longestWord = words[i];
			}
		}
		return longestWord;
	}
	public static String getShortestWord (String[] words) {
		String shortestWord = words[0];
		for (int i= 0;i<words.length;i++) {
			if (words[i].length()<shortestWord.length()) {
				shortestWord = words[i];
			}
		}
		return shortestWord;
	}

	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer> l = new ArrayList<Integer>();
		int count;
		l.add(arr[0]);
		for (int i=1;i<arr.length;i++) {
			count =0;
			for(int j=0;j< l.size();j++){
				if (arr[i] == l.get(j)) {
					count++;
				}
			}
			if (count == 0) {
				l.add(arr[i]);
			}
				
		}
		return l;
		}
	
	
}
