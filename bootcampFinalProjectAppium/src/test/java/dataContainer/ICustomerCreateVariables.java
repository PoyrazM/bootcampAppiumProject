package dataContainer;

// Customer oluşturduğum datalar için
public interface ICustomerCreateVariables extends IMain{

    final String CUSTOMER_PHONE = FAKER.phoneNumber().cellPhone();
    final String CUSTOMER_FULL_NAME = FAKER.name().fullName();
    final String PRODUCT_NUMBER = FAKER.number().digit();
    final String CUSTOMER_ADDRESS = FAKER.address().fullAddress();
}
