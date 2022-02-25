import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    // @Test
    // public void testFile1() throws IOException {
    //     String contents= Files.readString(Path.of("./test-file.md"));
    //     List<String> expect = List.of("https://something.com", "some-page.html");
    //     assertEquals(MarkdownParse.getLinks(contents), expect);
    // }
    
    // @Test
    // public void testFile2() throws IOException {
    //     String contents= Files.readString(Path.of("./test-file2.md"));
    //     List<String> expect = List.of("https://something.com", "some-page.html");
    //     assertEquals(MarkdownParse.getLinks(contents), expect);
    // }

    // @Test
    // public void testMissingCloseParen() {
    //     String contents= "[link title](a.com";
    //     List<String> expect = List.of();
    //     assertEquals(MarkdownParse.getLinks(contents), expect);
    // }

    // @Test
    // public void testSpaceAroundLink() {
    //     String contents= "[link title](   a.com   )";
    //     List<String> expect = List.of("a.com");
    //     assertEquals(expect, MarkdownParse.getLinks(contents));
    // }


    @Test
    public void testSnippet1() throws IOException{
        String contents= Files.readString(Path.of("test-file.md"));
        List<String> expect = List.of("a.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

}
