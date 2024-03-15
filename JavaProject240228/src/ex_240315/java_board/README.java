package ex_240315.java_board;

public class README {
	
	// 화면 
	// 1. 목록 (리스트)
	// 글쓰기 버튼
	// 2. 게시글 작성 (회원가입화면)
	// id(sequence 만들어서 자동생성), 작성자(자동), 글 제목, 내용, 등록날짜(자동), 조회수(기본 : 0)
	// 3. 게시글 상세보기 (회원가입 상세보기
	// 제목 수정. 내용 수정. 수정날짜(자동), 
	// 4. 회원가입 > 디비 연동. 아니면 일단 수동으로 
	
	// 준비물 : 데이터 베이스
	/*
	  CREATE SEQUENCE boarder_java_seq 
	  INCREMENT BY 1 
	  START WITH 1 
	  MINVALUE 1 
	  MAXVALUE 9999 
	  NOCYCLE 
	  NOCACHE 
	  NOORDER;
	 */
	// 기본 사용법 
		// INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
//	    VALUES (emp_seq.NEXTVAL
//	            , 'TIGER'
//	            , 'ANALYST'
//	            , 7566
//	            , TRUNC(SYSDATE)
//	            , 3000
//	            , NULL
//	            , 20)
		
		// id(sequence 만들어서 자동생성), 작성자(자동), 제목, 내용, 등록날짜(자동), 조회수(기본:0) 
	/*
		CREATE TABLE BOARDER_JAVA(
			    id number(20) NOT NULL,  
			    writer varchar2(30) NOT NULL, 
			    subject varchar2(100) NOT NULL,
		content varchar2(2000) NOT NULL,
		regDate varchar2(30) NOT NULL,
	    viewsCount number(20) NOT NULL,
		
		
			    CONSTRAINT pk_boarder_java PRIMARY KEY(id)  -- 기본키 지정
			);
		*/
	// 더미데이터 삽입
	// INSERT into BOARDER_java  values(boarder_seq.nextval,'신효은','제목1','내용1','2024-03-15, 16:27:00','0');
	
	// 조회해서 자동 증가하는 부분 확인
	// select * from boarder_java
		
 }
