package filter;

import base.BaseTests;
import org.testng.annotations.Test;
import page.Filter;

import static org.testng.Assert.assertEquals;

public class FilterTests extends BaseTests {

    @Test
    public void checkBox(){
        Filter filterCheck = homePage.filterCheck();
        filterCheck.checkBox();
    }

}
