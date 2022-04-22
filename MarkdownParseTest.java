import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    //original file
    @Test
    public void getLinkstestFile() throws IOException{
        Path filepath = Path.of("test-file.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(mdFile));
    }

    //my test files
    @Test
    public void getLinkstestFileLastLineFR() throws IOException{
        Path filepath = Path.of("testFR_fileLastLine.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://www.coolmathgames.com/", "https://twitter.com/?lang=en"), MarkdownParse.getLinks(mdFile));
    }
    
    @Test
    public void getLinkstestFilePt3FR() throws IOException{
        Path filepath = Path.of("testFR_filePt3.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://www.coolmathgames.com/", "https://twitter.com/?lang=en"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestFile4FR() throws IOException{
        Path filepath = Path.of("testFR_file4.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of(), 
            MarkdownParse.getLinks(mdFile));
    }

    //part 6 files
    @Test
    public void getLinkstestfile2() throws IOException{
        Path filepath = Path.of("test-file2.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestfile3() throws IOException{
        Path filepath = Path.of("test-file3.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of(), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestfile4() throws IOException{
        Path filepath = Path.of("test-file4.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of(), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestfile5() throws IOException{
        Path filepath = Path.of("test-file5.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of(), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestfile6() throws IOException{
        Path filepath = Path.of("test-file6.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of(), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestfile7() throws IOException{
        Path filepath = Path.of("test-file7.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of(), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestfile8() throws IOException{
        Path filepath = Path.of("test-file8.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(mdFile));
    }

}
