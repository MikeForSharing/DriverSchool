package com.lhh.car.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.lhh.car.domain.Student;

public class StudentUtil {

	public static List<Student> getAllStudents(List<Student> studentTopList) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		inspectStudentTreeList(studentTopList, "●", studentList);
		return studentList;
	}

	
	//遍历部门树，把遍历出来的结果集放在整个集合中
	private static void inspectStudentTreeList(Collection<Student> studentTopList, String prefix,
			ArrayList<Student> studentList) {
		for(Student deptTop : studentTopList) {
			
			
			//顶点
			Student deptCopy = new Student();//因为原对象在session中
			deptCopy.setId(deptTop.getId());
			deptCopy.setName(prefix + deptTop.getName());
//			deptTop.setName(prefix + deptTop.getName());	
			studentList.add(deptCopy);
			//子树
			inspectStudentTreeList(deptTop.getChildren(), "　"+ prefix, studentList);   //使用全角空格
		}
		
	}

}
