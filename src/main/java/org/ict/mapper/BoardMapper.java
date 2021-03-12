package org.ict.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.ict.domain.BoardVO;

public interface BoardMapper {

	@Select("SELECT * FROM ictboard where bno > 0")
	public List<BoardVO> getList();
}
