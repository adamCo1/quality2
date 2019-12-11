package system;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpaceTest {

    Space testSpace ;

    @Before()
    public void beforeEach() {
        testSpace = new Space(1);
    }

    @Test()
    public void spaceInit() {
        Assert.assertEquals(testSpace.getAlloc().length, 1);
        Assert.assertEquals(testSpace.countFreeSpace(), 1);
    }

    @Test()
    public void allocZeroSizeSpace() {

    }


    @Test()
    public void allocBigSizeSpace() {

    }

}