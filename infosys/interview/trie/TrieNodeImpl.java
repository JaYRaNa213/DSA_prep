package trie;

class TrieNode {

  TrieNode[] children = new TrieNode[26];

  boolean isEndOfWord;

}
class Trie{

  TrieNode root;

  public Trie(){
    root = new TrieNode();
  }



  public void insert(String word){

    TrieNode current = root;

    for ( int i = 0; i < word.length(); i++){

      char ch = word.charAt(i);
      int index = ch-'a';

      if ( current.children[index] == null ){
        current.children[index] = new TrieNode();

      }
      current = current.children[index];
    }
    current.isEndOfWord = true;
  }
}

public class TrieNodeImpl {
  public static void main (String args[]){
    Trie trie = new Trie();

    String[] words = { "jay", "pre", "huge"};

    for ( String word : words){
      trie.insert(word);
    }
    System.out.println( " All words inserted successfully");
  }
}


