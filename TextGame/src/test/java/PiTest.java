import static org.junit.jupiter.api.Assertions.*;
import com.example.textgame.LoadData;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import com.example.textgame.*;


public class PiTest {

    @Test
    void testAdd(){
        HashMap<String, String> storyMapping = new HashMap<String, String >();
        File file = new File("check.txt");
        LoadData data = new LoadData();
        storyMapping = data.Data(file);
        assertEquals("The story is working", storyMapping.get("Name"));
    }
}
