package org.study.maven.mybatis;

public class BaseCriterion extends Criterion {
	public String getWhereClause() {
		return whereClause;
	}

	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}

	protected String whereClause;
}
