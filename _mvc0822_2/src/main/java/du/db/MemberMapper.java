package du.db;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {
	@Select("select count(*) from members where email = #{email} and password = #{password}")
	public int isMember(MemberDTO dto);
	
	@Select("select * from members where email = #{email} and password = #{password}")
	public MemberDTO findMember(MemberDTO dto);
}
