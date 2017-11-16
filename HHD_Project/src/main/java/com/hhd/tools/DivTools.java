package com.hhd.tools;

/**
 * @author xjy
 *
 */
public class DivTools {
	
	private int pageSize;   //每页显示条数
	private int recordCount;//记录总条数
	private int currentPage;//当前页
	private int pageCount; //总页数
	
	public DivTools(int pageSize,int recordCount,int currentPage){
		this.pageSize = pageSize;
		this.recordCount = recordCount;
		this.setCurrentPage(currentPage);
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {				//�жϵ�ǰҳ���Ƿ񳬳���ҳ���С��1
		int activePage = currentPage <= 0 ? 1 : currentPage;
		activePage = currentPage > getPageCount()?pageCount:activePage;
		this.currentPage = activePage;
	}
	public int getPageCount() {
		pageCount = recordCount/pageSize;
		int mod = recordCount % pageSize;
		if(mod != 0){
			pageCount++;
		}
		return pageCount == 0?1:pageCount;
	}
	public int getFromIndex(){
		return (currentPage - 1) * pageSize;
	}
	public int getToIndex(){
		return currentPage * pageSize;
	}

}
