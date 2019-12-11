package system;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test()
    public void createNewTree(){
        String expectedName = "test";
        Tree testTree = new Tree(expectedName);
        String actualName = testTree.name;
        Assert.assertEquals(expectedName, actualName);
    }

    @Test()
    public void getExistingChildByName(){
        Tree testTree = new Tree("test");
        Node expectedChild = testTree.GetChildByName("child");
        Node actualChild = testTree.GetChildByName("child");
        Assert.assertEquals(expectedChild, actualChild);
    }

    @Test()
    public void getNoneExistentChildByName(){
        Tree testTree = new Tree("test");
        Node child = testTree.GetChildByName("child");
        String expectedChildName = "child";
        String actualChildName = child.name;
        int expectedDepth = testTree.depth+1 ;
        int actualDepth = child.depth ;
        Assert.assertEquals(expectedChildName, actualChildName);
        Assert.assertEquals(expectedDepth, actualDepth);
    }
}