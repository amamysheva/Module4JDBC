import database.service.DatabaseServiceInit;
import database.service.DatabasePopulateService;
import database.service.DatabaseQueryService;

public class JDBCDemo {
    public static void main(String[] args) {
        DatabaseServiceInit databaseInitService = new DatabaseServiceInit();
        databaseInitService.initDatabase();

        DatabasePopulateService databasePopulateService = new DatabasePopulateService();
        databasePopulateService.populateDatabase();

        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
        System.out.println(databaseQueryService.findMaxSalaryWorker());
        System.out.println(databaseQueryService.findMaxProjectsClient());
        System.out.println(databaseQueryService.findLongestProject());
        System.out.println(databaseQueryService.findYoungestEldestWorkers());
        System.out.println(databaseQueryService.findProjectPrices());
    }
}
