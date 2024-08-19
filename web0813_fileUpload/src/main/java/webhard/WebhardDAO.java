package webhard;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class WebhardDAO {
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public WebhardDAO() {
		session = sqlsession_f.openSession(true);
	}

	public List<Webhard> getAllWebhard() {
		return session.selectList("WebhardMapper.selectAllWebhard");
	}

	public void insertWebhard(Webhard webhard) {
		session.insert("WebhardMapper.insertWebhard", webhard);
	}

	public Webhard getWebhardById(int id) {
		return session.selectOne("WebhardMapper.selectWebhardBynum", id);
	}

	public void deleteWebhard(int id) {
		session.update("WebhardMapper.deleteWebhard", id);
	}

}
