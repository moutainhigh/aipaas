package com.ai.paas.ipaas.seq.service;

import java.util.List;




import com.ai.paas.ipaas.seq.dao.mapper.bo.Sequence;

public interface ISequenceSv {

	public Long nextVal(String sequenceName);

	/**
	 * 根据主键查询获取Sequence
	 *
	 * @param sequenceName
	 *            序列名 (sequence_name)
	 */
	public Sequence findByPkey(java.lang.String sequenceName);

	/**
	 * 获得列表list
	 * 
	 * @param SequenceInfo
	 */
	public List<Sequence> getModels(Sequence sequence);

	/**
	 * 新增操作
	 * 
	 * @param SequenceInfo
	 */
	public void addModel(Sequence sequence);

	/**
	 * 修改
	 * 
	 * @param SequenceInfo
	 */
	public void modModel(Sequence sequence);

	/**
	 * 删除
	 *
	 * @param logicId
	 *            逻辑库ID (LOGIC_ID)
	 */
	public void delModel(java.lang.String sequenceName);

}
