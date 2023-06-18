package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _2696 {
    public static class Solution1 {
       String intial="ABFCACDB"; 
		String returnedString = null;
		int counter=0;
		while(counter<intial.length()) {
			if(counter==0) {
				 returnedString=minLength(intial);
			}else {
				returnedString = minLength(returnedString);
			}
		counter++;
		}
		System.out.println("Final String is : "+returnedString +"  : Length : "+returnedString.length());
	}

	private static String minLength(String str) {
		StringBuilder subStr = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			int j = i + 1;
			if (j != str.length()) {
				int ascii = str.charAt(j);

				if (str.charAt(i) != (--ascii)) {
					subStr.append(str.charAt(i));
				} else {
					i++;
				}
			} else {
				subStr.append(str.charAt(i));
			}
		}
		return subStr.toString();
	}
        }
    }
}
