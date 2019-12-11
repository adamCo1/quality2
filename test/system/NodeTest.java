package system;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    Tree testTree ;

    @Before
    public void beforeEach() {
        testTree = new Tree("test") ;
    }

    @Test()
    public void getRootPath(){
        String[] expectedPath = new String[0];
        String[] actualPath = testTree.getPath();
        Assert.assertArrayEquals(expectedPath, actualPath);
    }

    @Test()
    public void getLongPath(){
        String[] expectedPath = new String[]{"node","path"};
        testTree = testTree.GetChildByName("node");
        testTree = testTree.GetChildByName("path");
        String[] actualPath = testTree.getPath();
        Assert.assertArrayEquals(expectedPath, actualPath);
    }

}