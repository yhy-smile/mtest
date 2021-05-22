import org.junit.Assert;
import org.junit.Test;

public class CaluTest {
    @Test
    public void shouldReturn2When1Plus1(){
        //ctrl+arl+v = 创建变量

        Calu calu = new Calu();
        int actualValue = calu.compute(1,1,'+');
        int expertValue = 2;
        Assert.assertEquals(actualValue,expertValue);
    }
    @Test
    public void shouldReturn0When1mov1(){
        //ctrl+arl+v = 创建变量

        Calu calu = new Calu();
        int actualValue = calu.compute(1,1,'-');
        int expertValue = 0;
        Assert.assertEquals(actualValue,expertValue);
    }
}