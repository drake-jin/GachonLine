package com.myspring.gachon.community.dao;

import com.myspring.gachon.community.vo.CommunityNormalContentVO;
import com.myspring.gachon.community.vo.CommunityNormalListVO;
import com.myspring.gachon.community.vo.CommunityNormalReplyVO;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface CommunityDAO {
	JSONArray getBoardList(String divs);
	JSONObject setWriteSubmit(CommunityNormalListVO list,CommunityNormalContentVO content);
	JSONObject getBoard(CommunityNormalListVO vo);
	JSONObject setReply(CommunityNormalReplyVO vo);
	JSONArray getReply(CommunityNormalListVO vo);
	JSONObject setReplyUpdate(CommunityNormalReplyVO vo);
	JSONObject setReplyDelete(CommunityNormalReplyVO vo);
	JSONObject setBoardDelete(CommunityNormalListVO vo);
	JSONObject setBoardUpdateSubmit(CommunityNormalContentVO vo,CommunityNormalListVO list);

}
