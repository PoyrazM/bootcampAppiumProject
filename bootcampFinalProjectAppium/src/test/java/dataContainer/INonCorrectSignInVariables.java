package dataContainer;

// Kayıt olmamış kullanıcı giriş denemesi için datalar
public interface INonCorrectSignInVariables extends IMain{

    final String NON_REGISTER_EMAIL = FAKER.internet().emailAddress();
    final String PASSWORD = FAKER.internet().password();

}
