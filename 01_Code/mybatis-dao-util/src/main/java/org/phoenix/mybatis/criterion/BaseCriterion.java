package org.phoenix.mybatis.criterion;

import java.util.ArrayList;
import java.util.List;

public class BaseCriterion extends Criterion {
	protected List<WhereClauses> orWhereClausesList = null;
	public BaseCriterion() {
		orWhereClausesList = new ArrayList<WhereClauses>();
	}
	public List<WhereClauses> getOrWhereClausesList() {
		return orWhereClausesList;
	}
	public WhereClauses addOrWhereClauses(WhereClauses whereClauses) {
		orWhereClausesList.add(whereClauses);
		return whereClauses;
	}
}
