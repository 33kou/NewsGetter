package model;

public class Filter {
    String filterName;
    WordList wordList;
    SourceList sourceList;
    NewsList newsList;


    public WordList getWordList(){
        return wordList;
    }

    public SourceList getSourceList(){
        return sourceList;
    }

    public NewsList getNewsList(){
        return newsList;
    }

    public String getFilterName(){
        return filterName;
    }

    public void setWordList(WordList a){
        wordList = a;
    }

    public void setSourceList(SourceList a){
        sourceList = a;
    }

    public void setNewsList(NewsList a){
        newsList = a;
    }

    public void setFilterName(String a){
        filterName = a;
    }

    public void getUserNewsFromInternet(){

    }
}
