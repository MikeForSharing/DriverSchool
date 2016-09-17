package com.lhh.car.base;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.domain.User;
import com.opensymphony.xwork2.ActionContext;


//@Transactional注解可以被继承
//@Transactional注解对父类中声明的方法无效

@Transactional
@SuppressWarnings("unchecked")
public abstract class DaoSupportImpl<T> implements DaoSupport<T> {

	@Resource
	private SessionFactory sessionFactory;
	
	private Class<T> clazz = null;
	
	
	public DaoSupportImpl() {
		//使用反射技术得到T的真是类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();  //获取当前new的对象的泛型的父类
		this.clazz = (Class<T>)pt.getActualTypeArguments()[0];
		System.out.println("clazz" + clazz);
	}
	
	protected Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	public void save(T entity) {
		getSession().save(entity);
	}

	public void delete(Long id) {
//		getSession().delete(id);
		Object obj = getById(id);
		if (obj != null) {
			getSession().delete(obj);
		}
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName())//
				.list();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(Long id) {
		
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName() + " WHERE id = " + id)//
				.list();
		
	}

	
	@SuppressWarnings("unchecked")
	public List<T> findAllreserve(Long idfalse) {
		Long idTrue = idfalse - 18;
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName() + " WHERE coachId = " + idTrue)//
				.list();
	}

	
	public T getById(Long id) {
		if(id == null) {
			return null;
		}else {
			return (T) getSession().get(clazz, id);
		}
		
	}

	public List<T> getByIds(Long[] ids) {	
		if (ids == null || ids.length == 0) {
			return Collections.EMPTY_LIST;
		} else {
			return getSession().createQuery(//
					"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")//
					.setParameterList("ids", ids)//
					.list();
		}
	}

}
