package dataContainer;

// Kayıt olma işlemi için datalar
public interface ISignUpVariables extends IMain {

    final String EMAIL = FAKER.internet().emailAddress();
    final String PASSWORD = FAKER.internet().password();

}
