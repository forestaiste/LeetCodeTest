package org.example.leetcode.pagefive;

//211. 添加与搜索单词 - 数据结构设计
//        请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配 。
//
//        实现词典类 WordDictionary ：
//
//        WordDictionary() 初始化词典对象
//        void addWord(word) 将 word 添加到数据结构中，之后可以对它进行匹配
//        bool search(word) 如果数据结构中存在字符串与 word 匹配，则返回 true ；否则，返回  false 。word 中可能包含一些 '.' ，每个 . 都可以表示任何一个字母。
//
//
//        示例：
//
//        输入：
//        ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
//        [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
//        输出：
//        [null,null,null,null,false,true,true,true]
//
//        解释：
//        WordDictionary wordDictionary = new WordDictionary();
//        wordDictionary.addWord("bad");
//        wordDictionary.addWord("dad");
//        wordDictionary.addWord("mad");
//        wordDictionary.search("pad"); // return False
//        wordDictionary.search("bad"); // return True
//        wordDictionary.search(".ad"); // return True
//        wordDictionary.search("b.."); // return True

public class DesignAddAndSearchWordsDataStructure211 {
    Trie root;
    public DesignAddAndSearchWordsDataStructure211() {
        root = new Trie(); // 初始化
    }

    public void addWord(String word) { // 将 word 添加到数据结构中，之后可以对它进行匹配
        Trie node = this.root;
        int n = word.length();
        for (int i=0;i<n;i++) {

            if (node.children[word.charAt(i) - 'a'] == null) {

                node.children[word.charAt(i) - 'a'] = new Trie();
            }
            node = node.children[word.charAt(i) - 'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {

        return searchWord(word, this.root);
    }

    public boolean searchWord(String word, Trie root) { // 递归

        Trie node = root;
        int n = word.length();
        for (int i=0;i<n;i++) {

            char c = word.charAt(i);
            if (c != '.' && node.children[c - 'a'] == null) return false;
            if (c == '.') { // 如果是 '.'，则对该节点所有不为空的节点进行深度搜索

                for (int j=0;j<26;j++) { // 继续遍历 node.children[26]

                    // 如果存在下一个字母，则从下一个字母开始再继续做检查
                    if (node.children[j] != null) {

                        if (searchWord(word.substring(i + 1), node.children[j])) {

                            return true;
                        }
                    }
                }
                return false;
            }
            node = node.children[c - 'a'];
        }
        return node.isEnd;
    }

    class Trie {

        Trie[] children;
        boolean isEnd;
        public Trie() { // 初始化

            children = new Trie[26];
            isEnd = false;
        }
    }

    public static void main(String[] args) {
        DesignAddAndSearchWordsDataStructure211 designAddAndSearchWordsDataStructure = new DesignAddAndSearchWordsDataStructure211();

        designAddAndSearchWordsDataStructure.addWord("bad");
        designAddAndSearchWordsDataStructure.addWord("dad");
        designAddAndSearchWordsDataStructure.addWord("mad");
        designAddAndSearchWordsDataStructure.addWord("pad");
        designAddAndSearchWordsDataStructure.search(".ad");
    }

}
