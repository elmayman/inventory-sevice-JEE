package org.sid.inventorysevice.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.sid.inventorysevice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
}
