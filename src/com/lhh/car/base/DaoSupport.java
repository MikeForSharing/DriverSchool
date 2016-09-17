package com.lhh.car.base;

import java.util.List;

public interface DaoSupport<T> {
	/**
	 * 保存实体
	 * @param entity
	 */
	void save(T entity);
	
	/**
	 * 删除实体
	 * @param entity
	 */
	void delete(Long id);
	/**
	 * 更新实体
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 查找全部实体
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * 查找全部实体
	 * @return
	 */
	List<T> findAll(Long id);
	List<T> findAllreserve(Long id);
	
	/**
	 * 查找实体
	 * @param id
	 * @return
	 */
	T getById(Long id);
	
	/**
	 * 查找实体	
	 * @param id
	 * @return
	 */
	List<T> getByIds(Long[] id);
	
}
