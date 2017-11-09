package org.study.maven.mybatis;

import java.util.ArrayList;
import java.util.List;

public class BaseCriterion extends Criterion {
	// 通常一个
	List<WhereClauses> orWhereClausesList = null;

	public BaseCriterion() {
		orWhereClausesList = new ArrayList<WhereClauses>();
	}

	public WhereClauses addOrWhereClauses(WhereClauses whereClauses) {
		orWhereClausesList.add(whereClauses);
		return whereClauses;
	}
}
