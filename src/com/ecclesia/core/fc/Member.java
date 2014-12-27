/**
 * 
 */
package com.ecclesia.core.fc;

import java.util.List;

/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014-2015 Sakthivel Sundaresan
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * @author Sakthivel Sundaresan sakthi.annauniv@gmail.com
 * 
 */
public class Member extends ManagedEntity {
	
	private String emailId;
	
	private String phoneNo;
	
	private MemberType memberType;
	
	private List<Gifts> gifts;
	
	private List<MinistryGroup> participatingMinistries;
	
	private String dateOfBirth;
	
	
	
	
	public Member(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public MemberType getMemberType() {
		return memberType;
	}


	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}


	public List<Gifts> getGifts() {
		return gifts;
	}


	public void setGifts(List<Gifts> gifts) {
		this.gifts = gifts;
	}


	public List<MinistryGroup> getParticipatingMinistries() {
		return participatingMinistries;
	}


	public void setParticipatingMinistries(
			List<MinistryGroup> participatingMinistries) {
		this.participatingMinistries = participatingMinistries;
	}
}
