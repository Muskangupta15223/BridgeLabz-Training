package billingPaymentsModule.dao;

public interface BillingDAO {

	int generateBill(int visitId, double additionalCharges);

	boolean recordPayment(int billId, String paymentMode);

	void viewOutstandingBills();

	void generateRevenueReport(String startDate, String endDate);
}
