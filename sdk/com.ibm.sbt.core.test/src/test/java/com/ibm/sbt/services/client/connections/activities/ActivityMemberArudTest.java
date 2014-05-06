/*
 * � Copyright IBM Corp. 2014
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.ibm.sbt.services.client.connections.activities;

import org.junit.Assert;
import org.junit.Test;

import com.ibm.commons.xml.XMLException;
import com.ibm.sbt.services.client.ClientServicesException;
import com.ibm.sbt.services.client.connections.common.Member;

/**
 * @author mwallace
 *
 */
public class ActivityMemberArudTest extends BaseActivityServiceTest {

	@Test
	public void testAddActivityMember() throws ClientServicesException, XMLException {
		Activity activity = createActivity();
		
		Member member = activity.addMember(Member.TYPE_PERSON, "daviryan@ie.ibm.com", Member.ROLE_OWNER);
		System.out.println(member.toXmlString());
	}
	
	@Test
	public void testRetrieveActivityMember() throws ClientServicesException, XMLException {
	}
	
	@Test
	public void testUpdateActivityMember() throws ClientServicesException, XMLException {
	}
	
	@Test
	public void testDeleteActivityMember() throws ClientServicesException, XMLException {
	}
	
}