package edu.kh.todo.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.todo.model.dto.Todo;

public interface TodoService {

	/**(TEST) todoNo 가 1인 할 일 제목 조회
	 * @return title
	 * */
	String testTitle();

	
	/** 할 일 목록 + 완료된 할 일 갯수 조회
	 * @return map
	 * */
	Map<String, Object> selectAll();

	
	
	
	/** 할 일 추가
	 * 
	 * 
	 * */
	int addTodo(String todoTitle, String todoContent);

	
	
	/** 할 일 상세 조회
	 * @param 
	 * */
	Todo todoDetail(int todoNo);

	
	
	/** 완료 여부 변경
	 * 
	 * */
	
	int changeComplete(Todo todo);

   
	/** 수정
	 * @param todo
	 * @return
	 */
	int updateDetail(Todo todo);


	/** 삭제하기
	 * @param todo
	 * @return
	 */
	int deleteComplete(Todo todo);


	/** 전체 할 일 개수 조회
	 * @return
	 */
	int getTotalCount();


	/** 완료된 할 일 개수 조회
	 * @return
	 */
	int getCompleteCount();


	/** 할 일 목록 조회
	 * @return
	 */
	List<Todo> selectList();


	/** 할 일 삭제(Ajax)
	 * @param todoNo
	 * @return result
	 */
	int todoDelete(int todoNo);


	
}
