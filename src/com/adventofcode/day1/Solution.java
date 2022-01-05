package com.adventofcode.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String file = "src/com/adventofcode/day1/inputs/input";
		Scanner scanner;
		List<String> inputs = new ArrayList<String>();
		try {
			scanner = new Scanner(new File(file));
			while (scanner.hasNextLine()) {
				inputs.add(scanner.nextLine());
			}
			scanner.close();
			System.out.println(incNumber(inputs));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int incNumber(List<String> inputs) {
		int n = 0;
		for (int i = 1; i < inputs.size(); i++)
			n += Integer.parseInt(inputs.get(i)) > Integer.parseInt(inputs.get(i - 1)) ? 1 : 0;
		return n;
	}
}
