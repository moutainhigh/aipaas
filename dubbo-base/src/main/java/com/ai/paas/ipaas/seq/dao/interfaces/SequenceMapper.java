package com.ai.paas.ipaas.seq.dao.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.paas.ipaas.seq.dao.mapper.bo.Sequence;
import com.ai.paas.ipaas.seq.dao.mapper.bo.SequenceCriteria;

public interface SequenceMapper {
	int countByExample(SequenceCriteria example);

	int deleteByExample(SequenceCriteria example);

	int deleteByPrimaryKey(String sequenceName);

	int insert(Sequence record);

	int insertSelective(Sequence record);

	List<Sequence> selectByExample(SequenceCriteria example);

	Sequence selectByPrimaryKey(String sequenceName);

	int updateByExampleSelective(@Param("record") Sequence record,
			@Param("example") SequenceCriteria example);

	int updateByExample(@Param("record") Sequence record,
			@Param("example") SequenceCriteria example);

	int updateByPrimaryKeySelective(Sequence record);

	int updateByPrimaryKey(Sequence record);
}