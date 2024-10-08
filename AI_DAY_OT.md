## AI
 - AI의 중요성 for 개발자 : 코드 생산성 UP / AI 소통 능력 UP / AI 문제 해결 역량 UP / 커리어 경쟁력 UP
 - 프로그래밍 : SW 1.0  /  머신러닝 : SW 2.0
 - Artificial Intelligence > Machine Learning > Deep Learning (End2End)
 - 인공 신경망 : 여러 인풋에 대해 각각 가중치를 부여하고 더해서 활성화 함수를 거쳐 출력 결정(역치)
### Regression
 - 정의 : 입력으로부터 연속적인 수치값 예측 문제
 - 예시 : 시험 점수, 집값, 수명 예측 등
 - 알고리즘 모델 : 선형 회귀 / 다항 회귀 / 회귀용 신경망 / ...

### Classification
 - 정의 : 입력을 사전 정의된 카테고리로 분류하는 문제
 - 예시 : 스팸 메일 필터링, 이미지 분류, 질병 진단 등
 - 알고리즘 모델 : 이진 분류 / 다중 분류 / ...

### How to Build AI
 - 딥러닝의 키 요소 : 데이터, 모델, Loss function(모델의 성공여부 판단하여 수치화, 매핑), 알고리즘(Loss 감소하는 방향으로 파라미터 업데이트)

#### 데이터
 - 텐서 : 3차원 이상의...
 - 이미지 데이터 : 픽셀로 구성, 밝기나 색상 정보 보유, 컬러이미지[높이,너비,RGB]
 - 시계열 데이터 : 시간 흐름에 따라 순서대로 수집 like 금융,기상,비디오 데이터

#### 모델
 - 영상인식 - Classifier : 입력 영상을 카테고리로 매핑해주는 함수

##### 퍼셉트론 
 - 각 입력값 xi와 가중치 wi가 존재할 때 xi * wi 벡터의 합으로 구성된 모델
 - 선형 결합 관계에 있는 가중치로 구성된 모델
 - 활성화 함수를 통해 임계값 초과 여부 기준삼아 0 또는 1로 결과 출력
 - 한계 : XOR 연산 같은 경우 모델로 구현 불가(현실의 복잡한 케이스들을 표현 불가) 
 - 입력층(XOR) - 은닉층(NAND + OR) - 출력층(AND)
 - 다층 퍼셉트론: 입력과 출력 레이어 사이에 중간 레이어(은닉충) 추가, 단일 퍼셉트론이 해결 불가능한 복잡한 연산 수행 가능

#### Activation Function
 - 정의 : 인공신경망에서 출력값 결정하는 함수
 - 레이어 간 이동시에 항상 활성화 함수 통과
 - 종류 : Step Function / Sigmoid / tanh / ReLU / Leaky ReLU / ELU / Softmax

#### Loss
 - 손실 함수(Loss Function) : 모델 출력값과 실제 데이터의 정답 사이의 오차 계산하는 함수
 - AI 모델 학습 = 데이터에 대한 정답에 근사한 예측 가능 모델 만드는 것 = loss 최저로
 - 평균 제곱 오차(MSE) : 오차가 커질수록 손실함수가 빠르게 증가

#### backpropagation
 - 오차 역전파 : 인공신경망에서 가중치 학습을 위한 알고리즘
 - 과정 : 순전파를 통해 오차 계산 -> 오차를 역방향으로 전파, 가중치의 오차 기여도 확인 및 가중치 업데이트
 - 체인 룰을 사용하영 기울기를 효과적으로 계산

##### Gradient descent
 - Loss의 편미분-> 한 변수가 Loss에 미치는 영향
 - Local Minima Problem : 전체 최적 지점 파악에 어려울 수 있음

#### Optimizer
 - 모델의 가중치와 편차를 업데이트하는 알고리즘
 - 종류 : 경사 하강법 / 확률적 경사 하강법 / 모멘텀 / AdaGrad / RMSProp / Adam

#### etc Models
 - AlexNet / ResNet / RNN/LSTM / UNet / Deep Auto-encoder / Transformer

#### 모델 평가란
 - 학습된 모델 테스트로 일반화 능력 측정 및 성능 개선 방향 결정

##### Overfitting
 - 모델이 새로운 데이터에 대한 일반화 성능이 떨어지는 현상
 - Training set에서 높은 성능, test case에서 낮은 성능
 - 대표적 치료법 : Data augmentation / Regularization / Model design change / More training data

##### K-fold cross-validation
 - 데이터를 K개로 나누고 하나를 Test, 나머지를 Training으로 활용
 - K번의 평과 결과를 평균 내서 최종모델 성능 측정


## GPT의 발전을 통해 보는 AI의 발전