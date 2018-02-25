package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {
	/**
	 * 查询所有的数据
	 * @return
	 */
	public List<TbBrand> findAll();

	/**
	 * 返回分页列表
	 * @param pageNum 当前页码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbBrand brand, int pageNum,int pageSize);

	/**
	 * 增加
	 * @param brand
	 */
	public  void  add(TbBrand brand);
	/**
	 * 修改
	 */
	public void update(TbBrand brand);
	/**
	 * 根据ID获取实体
	 */
	public TbBrand findOne(Long id);
	/**
	 * 批量删除
	 */
	public void delete(Long[] ids);
	/**
	 * 品牌下拉框数据列表
	 */
	public List<Map> selectOptionList();

}
