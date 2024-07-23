package com.sns.like.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sns.like.domain.Like;

@Mapper 
public interface LikeMapper {

	public int selectLikeCountBypostIdUserId(int userId,int postId);
	
	public int deleteLikeCountBypostIdUserId(int userId,int postId);
	
	public int insertLikeCountBypostIdUserId(int userId,int postId);
}
