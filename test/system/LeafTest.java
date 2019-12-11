package system;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeafTest {

    @Test()
    public void createLeaf() throws BadFileNameException, OutOfSpaceException{
        String expectedName = "leaf";
        int expectedSize = 10;
        Leaf testLeaf = new Leaf(expectedName, expectedSize);

        Assert.assertEquals(expectedName, testLeaf.name);
        Assert.assertEquals(expectedSize, testLeaf.size);

    }

    @Test()
    public void createLoeaf(){

    }


}