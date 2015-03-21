package model;

import java.util.ArrayList;

public class SourceList {
    ArrayList<String> sourceList;
    private ArrayList<String> Sources = new ArrayList<String>();
    public ArrayList getAll()
    {
    	return Sources;
    }
    public void add(String adname)
    {
	    Sources.add(adname);
    }
    public void remove(String rmname)
    {
    	for (int i = 0 ; i < Sources.size() ; i++)
    	{
    	     if(rmname.equals((Sources.get(i)))) //renameとi番のSourcesの中身が一致すれば
    	     {
    	    	 Sources.remove(i);//i番をリストから消す
    	     }
    	}

	
    }
}
