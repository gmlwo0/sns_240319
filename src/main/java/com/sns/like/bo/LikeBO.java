package com.sns.like.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.like.mapper.LikeMapper;

@Service
public class LikeBO {

	@Autowired
	private LikeMapper likeMapper;
	
	//  input:postId, userId
	// output:x
	public void likeToggle(int postId, int userId) {
		// 조회
		int count  = likeMapper.selectLikeCountBypostIdUserId(postId, userId);
		
		// 삭제 or 추가
		if (count > 0) {
			likeMapper.deleteLikeCountBypostIdUserId(userId, postId);
		}else {
			likeMapper.insertLikeCountBypostIdUserId(userId, postId);
		} 
	}
}
