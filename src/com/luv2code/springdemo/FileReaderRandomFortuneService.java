package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileReaderRandomFortuneService implements FortuneService {

	String fileName = "I:\\eclipse-oxygen-workspace\\spring-demo-annotations\\src\\fortunes.txt";

	private List<String> theFortunes;

	Random random = new Random();

	public FileReaderRandomFortuneService() {
		System.out.println("FileReaderRandomFortuneService: inside default constructor");
	}

	@PostConstruct
	private void loadTheFortunesFile() {
		System.out.println("FileReaderRandomFortuneService: inside loadTheFortunesFile method");

		File theFile = new File(fileName);

		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());

		// initialize the arraylist
		theFortunes = new ArrayList<>();

		// read the fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (IOException iex) {
			iex.printStackTrace();
		}

	}

	@Override
	public String getFortune() {

		int index = random.nextInt(theFortunes.size());

		return theFortunes.get(index);
	}

}
