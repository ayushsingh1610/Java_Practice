// Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.
interface Searchable {
    public void search(String keyword);
}

class Document implements Searchable {
    public void search(String keyword) {
        String str = "this keyword is used to give the refernce of current class data members";
        String w = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                w = w + ch;
            } else {
                // System.out.println(w);
                if (w.equals(keyword)) {
                    System.out.println("String is present = " + w);

                }
                w = "";
            }
        }
    }
}

class Webpage implements Searchable {
    public void search(String keyword) {
        String str = "The quick brown fox jumps over the lazy dog";
        String w = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                w = w + ch;
            } else {
                // System.out.println(w);
                if (w.equals(keyword)) {
                    System.out.println("String is present = " + w);

                }
                w = "";
            }
        }
    }
}

public class code06 {
    public static void main(String[] args) {
        Document d = new Document();
        Webpage w = new Webpage();
        d.search("keyword");
        w.search("brown");
    }

}
