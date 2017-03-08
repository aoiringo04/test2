package test.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.member.dto.MemberDto;
import test.mybatis.SqlMapConfig;

public class MemberDao{
	private static MemberDao dao;
	// MyBatis 를 사용하기 위한 핵심 객체
	private static SqlSessionFactory factory;

	private MemberDao(){}

	public static MemberDao getInstance(){
		if(dao == null){
			dao = new MemberDao();
			// SqlSessionFactory 객체의 참조값을 얻어와서 맴버필드에 저장
			factory = SqlMapConfig.getSqlSession();
		}
		return dao;
	}

	// 회원 정보를 DB 에 저장하는 작업
	public boolean insert(MemberDto dto){

		SqlSession session = factory.openSession(true);
		// 성공여부
		boolean isSuccess = false;
		try{
			/*
			 * - member.insert 의 의미 member : MemberMapper.xml 의 namespace insert
			 * : MemberMapper.xml 안에 있는 sql 문의 id
			 */
			session.insert("member.insert", dto);
			isSuccess = true;
		}catch(Exception e){
			e.printStackTrace();
		}

		return isSuccess;
	}// insert()

	// 회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList(){
		SqlSession session = factory.openSession();
		List<MemberDto> list = session.selectList("member.getList");
		return list;
	}
}
