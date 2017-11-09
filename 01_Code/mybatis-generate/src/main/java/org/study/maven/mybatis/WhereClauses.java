package org.study.maven.mybatis;

import java.util.ArrayList;
import java.util.List;

public class WhereClauses {
	List<WhereClause> andWhereClauselist = null;

	public WhereClauses() {
		andWhereClauselist = new ArrayList<WhereClause>();
	}

	public WhereClauses addWhereClause(WhereClause whereClause) {
		andWhereClauselist.add(whereClause);
		return this;
	}

	public class WhereClause {
		private String fieldName;
		private String condition;
		private String fieldValue;

		public WhereClause() {
		}

		public WhereClause(String fieldName, String condition, String fieldValue) {
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

		public String getFieldValue() {
			return fieldValue;
		}

		public void setFieldValue(String fieldValue) {
			this.fieldValue = fieldValue;
		}
	}
}
