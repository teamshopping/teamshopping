package com.neusoft.pojo;

import java.util.List;

public class Pager<T> {
	/**
	 * 当前页码
	 */
	private int pageIndex;
	/**
	 * 一页数据大小
	 */
	private int pageSize;
	/**
	 * 总记录条数
	 */
	private int dataCount;
	/**
	 * 页总数
	 */
	private int pageCount;
	/**
	 * 数据集合
	 * @return
	 */
	private List<T> list;
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getDataCount() {
		return dataCount;
	}
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	//午参构造
	public Pager() {
		super();
	}
	/**
	 * 有参构造方法
	 */
	public Pager(int pageIndex, int pageSize, int dataCount, List<T> list) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.dataCount = dataCount;
		this.pageCount=dataCount/pageSize;
		if(dataCount%pageSize!=0) 
		{
			this.pageCount++;
		}
		this.list = list;
	}
	
}
