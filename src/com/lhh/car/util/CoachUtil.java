package com.lhh.car.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.lhh.car.domain.Coach;

public class CoachUtil {

	public static List<Coach> getAllCoachs(List<Coach> coachTopList) {
		ArrayList<Coach> coachList = new ArrayList<Coach>();
		inspectCoachTreeList(coachTopList, "●", coachList);
		return coachList;
	}

	
	//遍历部门树，把遍历出来的结果集放在整个集合中
	private static void inspectCoachTreeList(Collection<Coach> coachTopList, String prefix,
			ArrayList<Coach> coachList) {
		for(Coach deptTop : coachTopList) {
			
			
			//顶点
			Coach deptCopy = new Coach();//因为原对象在session中
			deptCopy.setId(deptTop.getId());
			deptCopy.setName(prefix + deptTop.getName());
//			deptTop.setName(prefix + deptTop.getName());	
			coachList.add(deptCopy);
			//子树
			inspectCoachTreeList(deptTop.getChildren(), "　"+ prefix, coachList);   //使用全角空格
		}
		
	}

}
