# git 필기
## 커밋 / 푸쉬 규칙
* 꼭 ! 항상 ! 절대 ! `add`, `commit`, `push`는 최상단 폴더에서 작업하기

## 내가 지금 사용하고 있는 컴퓨터에서 처음으로 git작업을 할 때 1번만 하면 되는 작업

### `git config`
* 계정설정 및 추가
    * `git config --global user.name [나의 유저네임]`
    * `git config --global user.email [나의 깃헙 이메일]`
* 계정 확인
    * `git config --global user.name`
    * `git config --global user.email`
* 만약에 잘못 입력했다 싶으면 코드 다시 덮어쓰기 하면 됨

## 처음으로 git을 시작할 때 1번만 하면 되는 작업

### `git init`

### `git remote`
* `git remote add origin [나의 깃헙의 원격저장소(github) 레포 주소]`

* `git remote -v` : 내가 등록한 원격저장소 레포주소 확인

* `git remote remove origin` : 등록한 원격저장소 삭제

## working directory에 변동이 있을 때마다 하는 작업

### `git add`

### `git commit`

### `git push`

## 상태확인

### Working Directory에서
- `git status`
    - add 전/후

### staging area에서 (.git)
- `git status`
    - 추적이 되고 있는지만 확인 가능
- `git log`
    - commit 이후에만!!!
    - 내림차순
    - `--oneline` : 간결하게 보여줌

### branch 및 merge 관련
 - `git add .` -> `git commit` -> `git push origin main`
 - 동시에 올라가면 중첩된 부분 해결 후 다시 push