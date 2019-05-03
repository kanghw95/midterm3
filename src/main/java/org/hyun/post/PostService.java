package org.hyun.post;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	@Autowired
	PostDao postDao;

	static final Logger logger = LogManager.getLogger();

	/**
	 * (1) 글쓰기
	 */
	public void addPost() {
		Post post = new Post();
		post.setUserId("1");
		post.setName("강현우");
		post.setContent("중간고사 ..ㅎ");

		postDao.addPost(post);
		logger.debug("글을 등록");
	}

	/**
	 * (2) 목록 보기
	 */
	public void listPosts() {
		List<Post> postList = postDao.listPosts(0, 50);
		logger.debug(postList);
	}

	/**
	 * (3) 좋아요
	 */
	public void likePost() {
		final String postId = "56";
		// 56번 글에 좋아요를 한다.
		postDao.likePost(postId);

		// 56번 글을 가져와서 post 확인
		Post post = postDao.getPost(postId);
		logger.debug(post);
	}

}