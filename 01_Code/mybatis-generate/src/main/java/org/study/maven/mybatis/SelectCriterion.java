package org.study.maven.mybatis;

import java.util.ArrayList;
import java.util.List;

public class SelectCriterion {
	protected String orderByClause;

	protected boolean distinct;

	protected String whereClause;

	protected int begin;

	protected int length;

	protected List<String> selectiveColumnlist = null;

	public SelectCriterion() {
		selectiveColumnlist = new ArrayList<String>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public List<String> getSelectiveColumnlist() {
		return selectiveColumnlist;
	}

	protected void addCriterion(String column) {
		selectiveColumnlist.add(column);
	}
}