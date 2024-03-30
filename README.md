## part3-chapter4

# 이미지 추출 앱

<img src="https://github.com/soommmin/part3-chapter4/assets/150005268/5fc8c1af-3953-45c5-a6b0-f4027c6ee5b5" width="200" height="400"/>
<img src="https://github.com/soommmin/part3-chapter4/assets/150005268/f372daa3-8532-4122-af88-f56d08eb5831" width="200" height="400"/>



## What I Learned
1. [Retrofit2](https://square.github.io/retrofit/)
2. [Coil](https://coil-kt.github.io/coil/)
3. [MVC](https://ko.wikipedia.org/wiki/%EB%AA%A8%EB%8D%B8-%EB%B7%B0-%EC%BB%A8%ED%8A%B8%EB%A1%A4%EB%9F%AC)
   - 모델(Model): 데이터와 비즈니스 로직을 담당합니다.
   - 뷰(View): 사용자에게 보여지는 부분으로, UI를 담당합니다.
   - 컨트롤러(Controller): 모델과 뷰 사이의 중간자 역할을 합니다. 사용자의 입력을 받아 모델을 업데이트하고, 모델의 변화를 감지하여 뷰를 업데이트합니다.
5. [MVP](https://ko.wikipedia.org/wiki/%EB%AA%A8%EB%8D%B8-%EB%B7%B0-%ED%94%84%EB%A6%AC%EC%A0%A0%ED%84%B0)
   - 모델(Model): 데이터와 비즈니스 로직을 처리합니다.
   - 뷰(View): 사용자에게 보여지는 UI 요소를 담당합니다.
   - 프레젠터(Presenter): 뷰와 모델 사이의 중간자 역할을 합니다. 뷰에서 발생한 이벤트를 처리하고, 필요한 데이터를 모델로부터 가져와 뷰에 전달합니다.
7. [MVVM](https://ko.wikipedia.org/wiki/%EB%AA%A8%EB%8D%B8-%EB%B7%B0-%EB%B7%B0%EB%AA%A8%EB%8D%B8)
   - 모델(Model): 데이터와 비즈니스 로직을 처리합니다.
   - 뷰(View): 사용자에게 보여지는 UI 요소를 담당합니다.
   - 뷰모델(ViewModel): 뷰와 모델 사이의 중간자 역할을 합니다. 뷰에 표시할 데이터를 준비하고, 뷰에서 발생한 이벤트를 처리하여 모델과 상호작용합니다. 주로 데이터 바인딩을 통해 뷰와 뷰모델을 연결합니다.
9. [MVI](https://jaehochoe.medium.com/%EB%B2%88%EC%97%AD-%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C%EB%A5%BC-%EC%9C%84%ED%95%9C-mvi-model-view-intent-%EC%95%84%ED%82%A4%ED%85%8D%EC%B3%90-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0-165bda9dfbe7)
   - 모델(Model): 앱의 상태를 나타내는 데이터와 비즈니스 로직을 처리합니다.
   - 뷰(View): 사용자에게 보여지는 UI 요소를 담당합니다.
   - 인텐트(Intent): 사용자의 액션을 나타내는 이벤트를 처리하고, 이벤트를 모델로 전달하여 모델의 상태를 변경시킵니다. 모델의 상태 변경에 따라 뷰가 업데이트됩니다.
