package org.phoenix.criterion;

import java.util.ArrayList;
import java.util.List;

public class WhereClauses {
	private List<WhereClause> andWhereClauselist = null;

	public WhereClauses() {
		andWhereClauselist = new ArrayList<WhereClause>();
	}

	public List<WhereClause> getAndWhereClauselist() {
		return andWhereClauselist;
	}

	public WhereClauses addWhereClause(WhereClause whereClause) {
		if (whereClause.fieldName == null
				|| whereClause.fieldName.length() <= 0
				|| whereClause.condition == null
				|| whereClause.condition.length() <= 0) {
			throw new RuntimeException(
					"Value for fieldName or condition cannot be null");
		}
		andWhereClauselist.add(whereClause);
		return this;
	}

	public static class WhereClause {
		private String fieldName;
		private String condition;
		private Object fieldValue;

		public WhereClause() {
		}

		public WhereClause(String fieldName, String condition, Object fieldValue) {
			super();
			this.fieldName = fieldName;
			this.condition = condition;
			this.fieldValue = fieldValue;
		}

		public String getFieldName() {
			return fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getCondition() {
			return condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public Object getFieldValue() {
			return fieldValue;
		}

		public void setFieldValue(String fieldValue) {
			this.fieldValue = fieldValue;
		}
	}
}
