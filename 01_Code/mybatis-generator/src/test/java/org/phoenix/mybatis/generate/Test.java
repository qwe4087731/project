package org.phoenix.mybatis.generate;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.phoenix.mybatis.criterion.CountCriterion;
import org.phoenix.mybatis.criterion.SelectCriterion;
import org.phoenix.mybatis.criterion.UpdateCriterion;
import org.phoenix.mybatis.criterion.WhereClauses;
import org.phoenix.mybatis.criterion.WhereClauses.WhereClause;

import com.smart.db.mybatis.bean.UserInfoDO;
import com.smart.db.mybatis.dao.UserInfoDao;

public class Test {
	public static void main(String[] args) throws Exception {
		String resource = "SqlMapConfig.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		UserInfoDao userInfoMapper = session.getMapper(UserInfoDao.class);

		System.out
				.println("begin to to test select ===================================");
		SelectCriterion criterion = new SelectCriterion();
		criterion.addSelectiveColumn(UserInfoDO.USER_ID).addSelectiveColumn(
				UserInfoDO.USER_NAME);
		criterion.addOrWhereClauses(new WhereClauses()).addWhereClause(
				new WhereClause(UserInfoDO.SEX, "=", "f"));
		criterion.setLength(1);
		// criterion
		// .addOrWhereClauses(new WhereClauses())
		// .addWhereClause(
		// new WhereClause(UserInfo.USER_NAME, "=", "zhangsan"))
		// .addWhereClause(new WhereClause(UserInfo.USER_ID, "=", 2));
		criterion.setOrderByClause(UserInfoDO.USER_ID + " desc");
		List<UserInfoDO> userInfos = userInfoMapper.listByCriterion(criterion);

		// userInfoMapper.countByCriterion(criterion);
		// List<UserInfo> userInfos = userInfoMapper.selectByExample(null);

		for (UserInfoDO userInfo : userInfos) {
			System.out.println(userInfo);
		}

		System.out
				.println("begin to to test count ===================================");
		CountCriterion count = new CountCriterion();
		count.addOrWhereClauses(new WhereClauses()).addWhereClause(
				new WhereClause(UserInfoDO.USER_NAME, "=", "zhangsan"));
		int num = userInfoMapper.countByCriterion(count);
		System.out.println("count:" + num);

		System.out
				.println("begin to to test update ===================================");
		UpdateCriterion update = new UpdateCriterion();
		update.addOrWhereClauses(new WhereClauses()).addWhereClause(
				new WhereClause(UserInfoDO.USER_NAME, "=", "zhangsan"));
		UserInfoDO userInfo = new UserInfoDO();
		userInfo.setUserName("hello");
		num = userInfoMapper.updateByCriterion(userInfo, update);
		System.out.println("update:" + num);

		System.out
				.println("begin to to test delete ===================================");
		userInfoMapper.deleteByCriterion(null);
		System.out.println("delete:" + num);

	}
}
