
public class CustomerManager {
    //loosly (gevşek)-tightly(katı) coupled
    //bizim gevşek yapmamız gerekir
    //neye bağımlıysan onun private ini yap
    //private Logger logger; tek logger göndermemiz için
    private Logger[] loggers;
    /* TEK LOGGER İÇİN
    public CustomerManager(Logger logger) {
        this.logger=logger;
    }
*/
    public CustomerManager(Logger[] loggers){
        this.loggers=loggers;
    }


    public void add(Customer customer){
        System.out.println("Müşteri eklendi: "+ customer.getFirstName());
        /*
        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getFirstName() + "veri tabanına loglandı ");

         */
        //this.logger.log(customer.getFirstName());
        for(Logger logger:loggers){
            logger.log(customer.getFirstName());
        }
    }
    public void delete(Customer customer){
        System.out.println("Müşteri silindi: "+ customer.getFirstName());
        /*
        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getFirstName() + "veri tabanına loglandı ");

         */
        //this.logger.log(customer.getFirstName());
        for(Logger logger:loggers){
            logger.log(customer.getFirstName());
        }
    }
}
