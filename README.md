# Youngly

Youngly는 사용자들이 자산 관리, 목표 달성, 커뮤니티 활동을 함께 운영할 수 있도록 지원하는 서비스 프로젝트입니다. 이 저장소는 백엔드(Spring + MyBatis + MySQL)와 프론트엔드(Vue 3 + Vite)로 구성되어 있으며, 인증, 그룹, 챌린지, 포인트, 정산, 마이페이지 등 다양한 기능을 제공합니다.

## 프로젝트 구성

- `youngly-backend/`: Java 17 기반의 Spring MVC 백엔드 서버
- `youngly-frontend/`: Vue 3 기반의 웹 프론트엔드
- `youngly-backend/db/`: 데이터베이스 스키마 및 초기 데이터 SQL

## 기술 스택

### Backend
- Java 17
- Spring Framework 5.3.x
- Spring MVC / Security / WebSocket / Messaging
- MyBatis
- MySQL 8
- JWT 기반 인증
- Lombok
- Gradle

### Frontend
- Vue 3
- Vite
- Pinia
- Vue Router
- Axios
- ESLint / Prettier

## 주요 기능

- 사용자 인증 및 회원 관리
- 그룹/모임 생성 및 운영
- 챌린지, 라운드, 목표 관리
- 포인트, 자산, 정산, 납부 관리
- 알림 및 마이페이지 기능
- 설문/추천/공유형 콘텐츠 기능

## 저장소 구조

```text
Youngly/
├─ README.md
├─ youngly-backend/
│  ├─ build.gradle
│  ├─ gradlew
│  ├─ gradlew.bat
│  ├─ src/
│  ├─ db/
│  └─ docs/
├─ youngly-frontend/
│  ├─ package.json
│  ├─ vite.config.js
│  ├─ src/
│  └─ public/
└─ ...
```

## 사전 준비

다음 도구가 설치되어 있어야 합니다.

- JDK 17
- Gradle 8.8 (Gradle Wrapper 사용)
- Node.js 20.20.2 이상
- MySQL 8

## 백엔드 실행

1. MySQL을 실행하고 데이터베이스를 준비합니다.
2. `youngly-backend/src/main/resources/` 경로에 필요한 설정 파일을 추가합니다.
   - 예: `application.properties` 또는 환경별 설정 파일
   - DB 연결 정보, JWT 시크릿, 서버 설정 등을 입력합니다.
3. 아래 명령으로 빌드 및 실행합니다.

```bash
cd youngly-backend
./gradlew clean build
```

WAR 파일이 생성되면 로컬 서버 또는 톰캣에 배포할 수 있습니다.

```bash
./gradlew war
```

배포된 서버는 보통 Spring MVC 백엔드 API를 제공하며, Swagger UI가 활성화된 환경에서는 API 문서를 확인할 수 있습니다.

## 프론트엔드 실행

```bash
cd youngly-frontend
npm install
npm run dev
```

기본적으로 Vite 개발 서버가 실행되며, 브라우저에서 로컬 주소로 접속해 화면을 확인할 수 있습니다.

## 프로덕션 빌드

```bash
cd youngly-frontend
npm run build
```

빌드 결과물은 `dist/` 폴더에 생성됩니다.

## 데이터베이스 초기화

`youngly-backend/db/` 경로에 제공된 SQL 파일을 활용해 스키마와 초기 데이터를 구성할 수 있습니다.

```text
youngly-backend/db/
├─ schema.sql
├─ tables.sql
├─ data.sql
├─ test_data.sql
└─ ...
```

필요에 따라 테스트용 SQL 파일을 사용해 로컬 검증을 진행할 수 있습니다.

## 개발 가이드

- Backend 변경 시 `youngly-backend/`에서 Gradle 빌드와 테스트를 수행합니다.
- Frontend 변경 시 `youngly-frontend/`에서 `npm run build` 또는 `npm run lint`를 사용해 검증합니다.
- 환경 변수 및 DB 설정은 로컬 개발 환경에 맞게 조정해야 합니다.

## 참고

- 백엔드 프로젝트는 WAR 배포 형태를 기본으로 구성되어 있습니다.
- 프론트엔드는 별도 Vite 개발 서버를 통해 로컬 개발을 지원합니다.
- 프로젝트별 상세 설정은 각 모듈의 하위 README 또는 설정 파일을 확인하는 것이 가장 정확합니다.
