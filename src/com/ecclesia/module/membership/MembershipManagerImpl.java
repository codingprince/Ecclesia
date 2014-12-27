/**
 * 
 */
package com.ecclesia.module.membership;

import java.util.List;

import com.ecclesia.core.fc.Gifts;
import com.ecclesia.core.fc.Member;
import com.ecclesia.core.fc.MinistryGroup;

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
public class MembershipManagerImpl implements MembershipManager {
	
	/*
	 * @see com.ecclesia.module.membership.MembershipManager#addMember(com.ecclesia.core.fc.Member)
	 */
	public void addMember(Member member) {
		
	}
	/*
	 * @see com.ecclesia.module.membership.MembershipManager#deleteMember(long)
	 */
	public void deleteMember(long meId) {
		
	}
	
	/*
	 * @see com.ecclesia.module.membership.MembershipManager#updateMember(com.ecclesia.core.fc.Member)
	 */
	public void updateMember(Member member) {
		
	}
	
	/*
	 * @see com.ecclesia.module.membership.MembershipManager#getAllMembers()
	 */
	public List<Member> getAllMembers() {
		return null;
	}
	
	/*
	 * @see com.ecclesia.module.membership.MembershipManager#getMembersByMinistryGroup(com.ecclesia.core.fc.MinistryGroup)
	 */
	public List<Member> getMembersByMinistryGroup(MinistryGroup ministryGroup) {
		return null;
	}

	/*
	 * @see com.ecclesia.module.membership.MembershipManager#getMembersByGifts(com.ecclesia.core.fc.Gifts)
	 */
	public List<Member> getMembersByGifts(Gifts gifts) {
		return null;
	}
}
