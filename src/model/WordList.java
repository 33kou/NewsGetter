package model;

import java.util.ArrayList;

public class WordList {
    ArrayList<String> wordList;
    private ArrayList<String> words = new ArrayList<String>();
    public ArrayList getAll()
    {
    	return words;
    }
    public void add(String adname)
    {
    	words.add(adname);
    }
    public void remove(String rename)
    {
    	for (int i = 0 ; i < words.size() ; i++)
    	{
    		if(rename.equals((words.get(i))))//renameとi番のwordsの中身が一致すれば
    		{
    			words.remove(i);//i番をリストから消す
    		
    		}
    	}
    }
}
