package com.ai.platform.common.api.waitjobs.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.platform.common.api.waitjobs.param.WaitjobsCompleteRequset;
import com.ai.platform.common.api.waitjobs.param.WaitjobsInsertRequest;
import com.ai.platform.common.api.waitjobs.param.WaitjobsInsertResponse;

@Path("/waitjobsservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysWaitjobsMangeSV {
	
	/**
	 * 插入代办事物
	 * @param insertRequest 
	 * @return 组织机构信息
	 * @throws BusinessException,SystemException
	 * @author jiaxs
	 * @ApiCode PLAT_008
	 * @RestRelativeURL waitjobsservice/insertWaitjobs
	 */
	@POST
	@Path("/insertWaitjobs")
	WaitjobsInsertResponse insertWaitjobs(WaitjobsInsertRequest insertRequest) throws BusinessException,SystemException;

	/**
	 * 完结代办事物
	 * @param completeRequest
	 * @return 是否成功
	 * @throws BusinessException,SystemException
	 * @author jiaxs
	 * @ApiCode PLAT_009
	 * @RestRelativeURL waitjobsservice/completeWaitjobs
	 */
	@POST
	@Path("/completeWaitjobs")
	BaseResponse completeWaitjobs(WaitjobsCompleteRequset completeRequest) throws BusinessException,SystemException;
}
