package springboot.microservice.iitu.ServiseProvider.springbootmicroserviceproviderservice;

import org.springframework.data.jpa.repository.JpaRepository;

public class RepositoryExchaneValue {
    public interface ExchangeValueRepository extends

            JpaRepository<ExchangeValue, Long>{ }
}
