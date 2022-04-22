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

    @Test
    public void getLinkstestFile() throws IOException{
        Path filepath = Path.of("test-file.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestFileLastLine() throws IOException{
        Path filepath = Path.of("test_fileLastLine.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://www.coolmathgames.com/", "https://twitter.com/?lang=en"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestFilePt3() throws IOException{
        Path filepath = Path.of("test_filePt3.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://www.coolmathgames.com/", "https://twitter.com/?lang=en"), MarkdownParse.getLinks(mdFile));
    }

    @Test
    public void getLinkstestFile4() throws IOException{
        Path filepath = Path.of("test_file4.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://media.istockphoto.com/photos/carboard-box-wclippping-path-picture-id157318026?k=20&m=157318026&s=612x612&w=0&h=mTVCRfqtS2zKtbfKu_duQy5mvegvJqs8Z7mgQlZ06ck="), 
            MarkdownParse.getLinks(mdFile));
    }
}
