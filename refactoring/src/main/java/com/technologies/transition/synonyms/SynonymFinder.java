package com.technologies.transition.synonyms;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SynonymFinder {

	public static void main(String[] args) throws IOException {

		// list of all found synonyms
		LinkedList<WordSynonym> l1 = new LinkedList<>();
		
		// variable indicating if the program should continue
		boolean var1 = true;
		Scanner s = new Scanner(System.in);
		System.out.println(" Welcome to Synonym Searcher .");
		System.out.println("to find a word, please type 'search WORD', where WORD is the word we find synonyms for");
		while (var1) {
			System.out.print(" \nsynonyms > ");
			String c = s.nextLine();
			if (c.trim().equals("hello")) {
				System.out.println(" Welcome to Synonym Searcher .");
				System.out.println("to find a word, please type 'search WORD', where WORD is the word we find synonyms for");
			} else if (c.startsWith("search ")) {

				BufferedReader r = null;
				String plW = null;

				String enW = null;
				int i = 0;
				List<WordSynonym> l2 = new LinkedList<WordSynonym>();
				try {

					r = new BufferedReader(new InputStreamReader(new URL(
							"http://www.synonym.com/synonyms/"
									+ c.split(" ")[1] + "/").openStream()));
					String t = null;
					Pattern pat = Pattern.compile("<div class=\"Accent Sense\">.*?</div>(.*?)<br /><span class=\"equals\">(.*?)</span>");
					while ((t = r.readLine()) != null) {
						Matcher matcher = pat.matcher(t);
						i = 0;
						String sp = t;
						while (matcher.find()) {

							try {
	
								WordSynonym w = new WordSynonym(c.split(" ")[1]);
								
		
								w.setMeaningList(Arrays.asList(matcher.group(1).split(",")));

								w.setSynonymsList(Arrays.asList(matcher.group(2).split(",")));
								System.out.println("------------------------");
								System.out.println("word: " + w.getWord());
								System.out.println("meaning: " + w.getMeaningList());
								System.out.println("synonyms: " + w.getSynonymsList());

								// add this to the newly found list
								l2.add(w);

							} catch (Throwable tx) {
							}
						}
					}
				} catch (MalformedURLException ex) {
					ex.printStackTrace();
				} catch (IOException ex) {
					ex.printStackTrace();
				} finally {
					try {
						if (r != null) {
							r.close();
						}
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
				l1.addAll(l2);

			} else if (c.equals("showfound")) {
				for (WordSynonym w : l1) {
					System.out.println("------------------------");
					System.out.println("word: " + w.getWord());
					System.out.println("meaning: " + w.getMeaningList());
					System.out.println("synonyms: " + w.getSynonymsList());
				}
			} else if (c.startsWith("save")) {
				FileWriter writer = new FileWriter(c.split(" ")[1]); 
				
				for (WordSynonym w : l1) {
					writer.write("------------------------");
					writer.write("\n");
					writer.write("word: " +w.getWord()+"\n");
					writer.write("meaning: " + w.getMeaningList()+"\n");
					writer.write("synonyms: " + w.getSynonymsList());
					writer.write("\n");
				}
				
				writer.close();
				
			}else if (c.equals("help")) {
				System.out.println(" Welcome to Synonym Searcher .");
				System.out.println("to find a word, please type 'search WORD', where WORD is the word we find synonyms for");
				
			} else if (c.equals(" exit ")) {
				var1 = false;
			}
		}
		s.close();
	}

}
