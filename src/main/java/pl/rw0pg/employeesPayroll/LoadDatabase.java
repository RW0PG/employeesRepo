package pl.rw0pg.employeesPayroll;


import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Karol Maczuga", "prawie programista")));
            log.info("Preloading " + repository.save(new Employee("Kuba Nowak", "kox programista")));
            log.info("Preloading " + repository.save(new Employee("Jakub Podolski", "kox programista")));
            log.info("Preloading " + repository.save(new Employee("Jakub Kanclerz", "Programista 300k")));
        };
    }
}