package du.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class MemberDAO {
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public MemberDAO() {
		session = sqlsession_f.openSession(true);
	}

	public int isMember(MemberDTO dto) {
		MemberMapper mm = session.getMapper(MemberMapper.class);
		return mm.isMember(dto);
	}
	
	public MemberDTO findMember(MemberDTO dto) {
		MemberMapper mm = session.getMapper(MemberMapper.class);
		return mm.findMember(dto);
	}
}
