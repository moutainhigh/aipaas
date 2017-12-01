package com.ai.dubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.paas.ipaas.rpc.api.seq.ISequenceRPC;
import com.ai.paas.ipaas.rpc.api.vo.ApplyInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:dubbo/applicationContext-dubbo-service-consumer.xml" })
public class SeqDubbboClientTest {
	@Autowired
	ISequenceRPC seqRPC;

	@Test
	public void testNextVal() throws Exception {

		System.out.println(seqRPC.nextVal("cust_id"));
	}

	@Test
	public void testException() throws Exception {
		ApplyInfo info = new ApplyInfo();
		System.out.println(seqRPC.getSeq(info));
	}

}
