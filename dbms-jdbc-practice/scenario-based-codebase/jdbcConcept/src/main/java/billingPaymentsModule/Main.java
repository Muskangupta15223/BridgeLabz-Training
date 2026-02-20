package billingPaymentsModule;

import billingPaymentsModule.dao.BillingDAO;
import billingPaymentsModule.dao.BillingDAOImpl;

public class Main {

    public static void main(String[] args) {

        BillingDAO dao = new BillingDAOImpl();

        int billId = dao.generateBill(8, 200);

        dao.recordPayment(billId, "CASH");

        dao.viewOutstandingBills();

        dao.generateRevenueReport("2026-02-01", "2026-02-28");
    }
}
