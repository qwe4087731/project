package org.study.maven.mybatis;

public class DeleteCriterion extends BaseCriterion {
	protected boolean isAll = false;

	public boolean isAll() {
		return isAll;
	}

	public void setAll(boolean isAll) {
		this.isAll = isAll;
	}
}