//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            System.out.println("open bracket: " + openBracket);

            int closeBracketAndOpenParentheses = markdown.indexOf("](", openBracket);
            System.out.println("close bracket: " + closeBracketAndOpenParentheses);

            // int openParen = markdown.indexOf("(", closeBracket);
            // System.out.println("open paren: " + openParen);

            int closeParen = markdown.indexOf(")", closeBracketAndOpenParentheses);
            System.out.println("close paren: " + closeParen);

            toReturn.add(markdown.substring(closeBracketAndOpenParentheses + 1, closeParen));
            System.out.println("after last ), return is " + toReturn);

            currentIndex = closeParen + 1;
            System.out.println("current Index: " + currentIndex);
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
