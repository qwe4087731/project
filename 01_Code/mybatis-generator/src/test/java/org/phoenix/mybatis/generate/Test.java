package org.phoenix.mybatis.generate;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.phoenix.mybatis.generate.Criterion.CountCriterion;
import org.phoenix.mybatis.generate.Criterion.SelectCriterion;
import org.phoenix.mybatis.generate.Criterion.UpdateCriterion;
import org.phoenix.mybatis.generate.Criterion.WhereClauses;
import org.phoenix.mybatis.generate.Criterion.WhereClauses.WhereClause;

import com.smart.db.mybatis.bean.UserInfo;
import com.smart.db.mybatis.dao.UserInfoMapper;

public class Test {
	public static void main(String[] args) throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		UserInfoMapper userInfoMapper = session.getMapper(UserInfoMapper.class);

		System.out
				.println("begin to to test select ===================================");
		SelectCriterion criterion = new SelectCriterion();
		criterion.addSelectiveColumn(UserInfo.USER_ID).addSelectiveColumn(
				UserInfo.USER_NAME);
		criterion.addOrWhereClauses(new WhereClauses()).addWhereClause(
				new WhereClause(UserInfo.SEX, "=", "f"));
		criterion.setLength(1);
		// criterion
		// .addOrWhereClauses(new WhereClauses())
		// .addWhereClause(
		// new WhereClause(UserInfo.USER_NAME, "=", "zhangsan"))
		// .addWhereClause(new WhereClause(UserInfo.USER_ID, "=", 2));
		criterion.setOrderByClause(UserInfo.USER_ID + " desc");
		List<UserInfo> userInfos = userInfoMapper.selectByCriterion(criterion);

		// userInfoMapper.countByCriterion(criterion);
		// List<UserInfo> userInfos = userInfoMapper.selectByExample(null);

		for (UserInfo userInfo : userInfos) {
			System.out.println(userInfo);
		}

		System.out
				.println("begin to to test count ===================================");
		CountCriterion count = new CountCriterion();
		count.addOrWhereClauses(new WhereClauses()).addWhereClause(
				new WhereClause(UserInfo.USER_NAME, "=", "zhangsan"));
		int num = userInfoMapper.countByCriterion(count);
		System.out.println("count:" + num);

		System.out
				.println("begin to to test update ===================================");
		UpdateCriterion update = new UpdateCriterion();
		update.addOrWhereClauses(new WhereClauses()).addWhereClause(
				new WhereClause(UserInfo.USER_NAME, "=", "zhangsan"));
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("hello");
		num = userInfoMapper.updateByCriterion(userInfo, update);
		System.out.println("update:" + num);

		System.out
				.println("begin to to test delete ===================================");
		userInfoMapper.deleteByCriterion(null);
		System.out.println("delete:" + num);

	}
}
