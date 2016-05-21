package com.zhaojun.ssm.serviceImpl;

import com.zhaojun.ssm.dao.StudentDao;
import com.zhaojun.ssm.model.Student;
import com.zhaojun.ssm.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	@Override
	public Student queryStudent(String id) {		
		return studentDao.queryStudent(id);
	}
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
}
