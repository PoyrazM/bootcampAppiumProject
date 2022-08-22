# Appium Project

patikaappium.apk'sı için 5 adet senaryo oluşturularak Test Caseleri yazılmıştır.

![image](https://user-images.githubusercontent.com/105527159/185832237-42c106b8-a5ae-436f-a9fc-bc6016572c12.png)

## Android Device Capabilities
Eğer farklı bir cihazda testi koşmak isterseniz Virtual Device ayarlarına göre dizayn edebilirsiniz.
```
{
  "appium:deviceName": "oreo",
  "platformName": "ANDROID",
  "appium:automationName": "UIAutomator2",
  "appium:udid": "emulator-5554",
  "appium:avd": "oreo"
}
```

## Test Cases
```
- New Customer Save Test
- Empty Email Sign In Test
- Non Correct Username Sign In Test
- Sign Up Test
- Successfully Sign In Test
```

- [CustomerSaveTestNG](https://github.com/PoyrazM/bootcampAppiumProject/blob/main/bootcampFinalProjectAppium/src/test/java/tests/CustomerSaveTestNG.java)
- [EmptyEmailSignInTestNG](https://github.com/PoyrazM/bootcampAppiumProject/blob/main/bootcampFinalProjectAppium/src/test/java/tests/EmptyEmailSignInTestNG.java)
- [NonCorrectUsernameSignInTestNG](https://github.com/PoyrazM/bootcampAppiumProject/blob/main/bootcampFinalProjectAppium/src/test/java/tests/NonCorrectUsernameSignInTestNG.java)
- [SignUpTestNG](https://github.com/PoyrazM/bootcampAppiumProject/blob/main/bootcampFinalProjectAppium/src/test/java/tests/SignUpTestNG.java)
- [SuccessfullySignInTestNG](https://github.com/PoyrazM/bootcampAppiumProject/blob/main/bootcampFinalProjectAppium/src/test/java/tests/SuccessfullySignInTestNG.java)

## Allure Report Results
![appium1](https://user-images.githubusercontent.com/105527159/185833349-64ee1db9-9dfa-4213-b951-b0cafc9f2d24.PNG)
![appium2](https://user-images.githubusercontent.com/105527159/185833383-7f0eac61-141a-4319-a9de-d06841d5e3eb.PNG)

## Author
[PoyrazM](https://github.com/PoyrazM)
