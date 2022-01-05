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
			System.out.println(incWindow(inputs));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int incNumber(List<String> inputs) {
		int n = 0;
		for (int i = 0; i < inputs.size() - 1; i++)
			n += Integer.parseInt(inputs.get(i + 1)) > Integer.parseInt(inputs.get(i)) ? 1 : 0;
		return n;
	}

	public static int incWindow(List<String> inputs) {
		int n = 0;
		List<Integer> window = new ArrayList<Integer>();
		for (int i = 0; i < inputs.size() - 2; i++) {
			window.add(Integer.parseInt(inputs.get(i)) + Integer.parseInt(inputs.get(i + 1))
					+ Integer.parseInt(inputs.get(i + 2)));
			if (i > 0)
				n += window.get(i) > window.get(i - 1) ? 1 : 0;
		}

		return n;
	}
}
