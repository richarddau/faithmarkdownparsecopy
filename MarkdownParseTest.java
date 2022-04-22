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
    public void getLinksOntestFile() throws IOException{
        
        Path filepath = Path.of("test-file.md");
        String mdFile = Files.readString(filepath);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(mdFile));
    }
}
