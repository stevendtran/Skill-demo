import static org.junit.Assert.*;
import org.junit.*;
 
public class SkillDemoTest{
    @Test
    public void LbstoKgsTest(){
        assertEquals(45.3592, SkillDemo.convertLbs(100), 4);
    }
 
    @Test
    public void KgsToLbsTest(){
        assertEquals(3.3069, SkillDemo.convertKgs(1.5), 4);
    }
}

