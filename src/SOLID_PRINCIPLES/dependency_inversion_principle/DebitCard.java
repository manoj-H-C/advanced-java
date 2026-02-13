package SOLID_PRINCIPLES.dependency_inversion_principle;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("payment using Debit card");
    }
}
