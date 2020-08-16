package cn.jiyun.pojo;

public class PageVo {
	
	private Integer pageNum;
	private Employee employee;
	
	
	
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "PageVo [pageNum=" + pageNum + ", employee=" + employee + "]";
	}
	
	
	
}
