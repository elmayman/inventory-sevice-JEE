package org.sid.inventorysevice;

import org.sid.inventorysevice.entities.Product;
import org.sid.inventorysevice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventorySeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventorySeviceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration
                            ){
        return args ->{
            repositoryRestConfiguration.exposeIdsFor(Product.class);
            productRepository.save(new Product(null,"PC",900,12));
            productRepository.save(new Product(null,"Imprimante",500,10));
            productRepository.save(new Product(null,"SmartPhone",1000,112));
            productRepository.save(new Product(null,"Smartwatch",100,110));
            productRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };
    }
}
