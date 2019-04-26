import com.lianxi.entity.Assess;
import com.lianxi.entity.Cellphone;
import com.lianxi.service.*;
import com.lianxi.service.help.AssistService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Test1 {
    @Resource
    private CellphoneModelService cellphoneModelService;
    @Resource
    private CellphoneService cellphoneService;
    @Resource
    private RecycleService recycleService;
    @Resource
    private AssistService assistService;
    @Resource
    private RecycleBranchService recycleBranchService;
    @Resource
    private ConditionService conditionService;
    @Resource
    private AssessService assessService;
    @Test
    public void aa(){
//        List<CellphoneModelDao> aa = cellphoneModelService.findAll();
////        List<Cellphone> bb = cellphoneService.findPaging(0);
//        System.out.println(aa);
//        System.out.println("------------------------------>");
////        System.out.println(bb);
//        List<Cellphone> vi = cellphoneService.findDim("vi", 0);
//        System.out.println("===========");
//        System.out.println(vi);
//        System.out.println("----------------------------->>>>>>>>>>>>>>>>>");
//        List<Recycle> recycles = recycleService.findAll(1);
//        System.out.println(recycles);
//        List<Map> one = assistService.one(1);
//        System.out.println(one);
//        System.out.println("===================>>>>>>>>>>>>>>>>>>>>>>>>>");
//        List<Map> two = assistService.two(1);
//        System.out.println(two);
//        System.out.println("=======<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        List<Map> three = assistService.three(1);
//        System.out.println(three);
//        String[] id=new String[]{"15","16","18"};
//        List<Helper> byId = recycleBranchService.findHelp(id);
//        System.out.println(byId);
        Assess byIdA = assessService.findId("01");
        System.out.println(byIdA);
        Cellphone id = cellphoneService.findId(1);
        System.out.println(id);
    }
}
