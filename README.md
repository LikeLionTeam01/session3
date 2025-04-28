# 팀별로 Entity, DAO, Dto, Service, Controller 만들어보기!

## 📌 주제
간단한 데이터베이스를 기반으로 팀별로  
Entity, DAO, Dto, Service, Controller 나누어 협업 연습하기

## 📂 프로젝트 구성
- **Entity**: 데이터베이스 테이블과 매핑되는 클래스
- **DAO**: 데이터베이스 접근을 담당
- **Dto**: 데이터 전송 객체 (Request, Response)
- **Service**: 비즈니스 로직 처리
- **Controller**: HTTP 요청/응답 처리

## ✨ 사용 기술
- Java 17
- Spring Boot
- JPA (Hibernate)
- MariaDB
- Swagger (API 테스트용)

## ⚙️ 실행 방법
1. MariaDB에 `restaurant` 데이터베이스 생성
2. application.properties에 DB 접속 정보 설정
3. 프로젝트 실행
4. Swagger를 통해 API 테스트

## 🔥 목표
- 계층별 역할을 이해하고 분리하여 개발하는 경험 쌓기
- 팀원 간 코드 병합과 협업 실습

