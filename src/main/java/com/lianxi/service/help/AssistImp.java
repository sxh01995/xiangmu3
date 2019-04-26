package com.lianxi.service.help;

import com.lianxi.dao.AssessDao;
import com.lianxi.dao.CellphoneDao;
import com.lianxi.dao.RecycleBranchDao;
import com.lianxi.dao.RecycleDao;
import com.lianxi.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class AssistImp implements AssistService {
    @Resource
    private RecycleBranchDao recycleBranchDao;
    @Resource
    private RecycleDao recycleDao;
    @Resource
    private CellphoneDao cellphoneDao;
    @Resource
    private AssessDao assessDao;
    //第一步筛选条件
    @Override
    public List<Map> one(Integer cellphoneId) {
        //根据手机ID查询所有的折损父类条件
        List<Recycle> recycleList = recycleDao.findAll(cellphoneId);
        List<Map> oneList=new ArrayList<>();
        for(Recycle recycle:recycleList){
            Map<String, List<RecycleBranch>> oneStep=new LinkedHashMap<>();
            //遍历折损父类条件集合当到ID为"zk-6"时为第一步筛选条件
            if(!recycle.getRecycleId().equals("zk-6")){
                //根据手机ID和父类条件ID查询子类的条件
                List<RecycleBranch> branchList = recycleBranchDao.findById(cellphoneId, recycle.getRecycleId());
                oneStep.put(recycle.getRecycleName(),branchList);
                oneList.add(oneStep);
            }else {
                break;
            }
        }
        return oneList;
    }
    //第二部筛选条件
    @Override
    public List<Map> two(Integer cellphoneId) {
        //根据手机ID查询所有的折损父类条件
        List<Recycle> recycleList = recycleDao.findAll(cellphoneId);
        //定义一个接收返回的Map数组
        Map<String, List<RecycleBranch>> oneStep=new LinkedHashMap<>();
        List<Map> twoList=new ArrayList<>();
        for(Recycle recycle:recycleList){
            //遍历折损父类条件集合当ID等于为"zk-6"时为第二步条件
            if(recycle.getRecycleId().equals("zk-6")){
                //根据手机ID和父类条件ID查询子类的条件
                List<RecycleBranch> branchList = recycleBranchDao.findById(cellphoneId, recycle.getRecycleId());
                oneStep.put(recycle.getRecycleName(),branchList);
                twoList.add(oneStep);
                break;
            }
        }
        return twoList;
    }

    @Override
    public List<Map> three(Integer cellphoneId) {
        //根据手机ID查询所有的折损父类条件
        List<Recycle> recycleList = recycleDao.findAll(cellphoneId);
        List<Map> threeList=new ArrayList<>();
        for(Recycle recycle:recycleList){
            Map<String, List<RecycleBranch>> oneStep=new LinkedHashMap<>();
            //遍历折损父类条件集合当ID等于为"zk-6"时，清空之前的数据，然后继续存放，为第三步条件
            if(!recycle.getRecycleId().equals("zk-6")){
                //根据手机ID和父类条件ID查询子类的条件
                List<RecycleBranch> branchList = recycleBranchDao.findById(cellphoneId, recycle.getRecycleId());
                oneStep.put(recycle.getRecycleName(),branchList);
                threeList.add(oneStep);
            }else {
                threeList.clear();
                oneStep.clear();
            }
        }
        return threeList;
    }

    @Override
    public String saveAssess(String id ,Integer cId) {
        String[] conId = id.toString().split(",");
        List<Helper> help = recycleBranchDao.findHelp(conId);
        //用于计算总损耗系数
        Double coe=0.00;
        //用于拼接损耗条件信息
        String message=null;
        if(help!=null&&help.size()>0){
            for (Helper aa:help){
                coe+=aa.getConditionMoney();
                if(aa.getBranchDescribe()!=null){
                    message+=aa.getBranchName()+","+aa.getBranchDescribe()+",";
                }else {
                    message+=aa.getBranchName()+",";
                }
            }
//            获取手机的信息
            Cellphone cellphone = cellphoneDao.findId(cId);
//           计算折损后的价格
            Integer result= (int) (cellphone.getCellphonePrice()*(1-coe));
//            创建随机ID
            String[] uuid = UUID.randomUUID().toString().split("-");
//            添加数据
            Integer save = assessDao.save(new Assess(uuid[0], cellphone.getCellphoneId(), result, message,cellphone.getCellphoneImg()));
            System.out.println(save);
            if(save>0){
                return uuid[0];
            }
        }
        return null;
    }
}
