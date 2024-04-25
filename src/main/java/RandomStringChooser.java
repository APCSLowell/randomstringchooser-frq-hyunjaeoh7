import java.util.*;
public class RandomStringChooser
{
  private String[] ok;
  private ArrayList <Integer> index;
  public RandomStringChooser(String[] bruh){
    ok = new String[bruh.length()];
    index = new ArrayList <Integer>();
    for(int i = 0; i < bruh.length; i++){
      ok[i] = bruh[i];
    }
  }

  public String getNext(){
    if(index.size() == ok.length()){
      return "NONE";
    }
    while(true){
      int fs = (int)(Math.random() * bruh.length());
      if(!index.contains(fs)){
        index.add(fs);
        return ok[fs];
      }
    }
  }
}
