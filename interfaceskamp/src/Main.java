public class Main {

    public static void main(String[] args) {
    Logger[] loggers= {new SmsLogger(),new EmailLogger(), new DatabaseLogger(), new FileLogger()};
    CustomerManager customerManager =new CustomerManager(loggers);
    Customer fatmanur = new Customer(1,"fatmanur","gebesoglu");
    customerManager.add(fatmanur);

    }
}
