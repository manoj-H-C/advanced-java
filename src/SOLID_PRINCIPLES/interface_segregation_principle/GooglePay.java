package SOLID_PRINCIPLES.interface_segregation_principle;

public class GooglePay implements CashBackManager, UPIPayments{
    @Override
    public void getCashBackAsCreditBalance() {

    }

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
