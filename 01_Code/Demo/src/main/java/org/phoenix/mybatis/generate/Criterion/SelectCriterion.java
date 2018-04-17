package org.phoenix.mybatis.generate.Criterion;

import java.util.ArrayList;
import java.util.List;

public class SelectCriterion extends BaseCriterion {
	private String orderByClause;

	private boolean distinct;

	private int begin;

	private int length;

	private List<String> selectiveColumnlist = null;

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

	public SelectCriterion addSelectiveColumn(String column) {
		selectiveColumnlist.add(column);
		return this;
	}
}